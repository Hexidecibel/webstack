package com.tipgiv.web.security.services

import com.tipgiv.webstack.db.models.Tables.TG_USER
import com.tipgiv.webstack.db.models.tables.records.TgUserRecord
import com.tipgiv.web.security.CustomUserDetails
import org.jooq.DSLContext
import org.jooq.Result
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsService : UserDetailsService {
    @Autowired
    private lateinit var db : DSLContext

    override fun loadUserByUsername(username: String): UserDetails {
        //Get User
        val result: Result<TgUserRecord> = db.selectFrom(TG_USER)
                .where(TG_USER.USER_NAME.eq(username))
                .fetch()

        if (result.size == 0) {
            throw UsernameNotFoundException("Username not found")
        }

        val user: TgUserRecord = result.get(0)

        // Construct user details
        return CustomUserDetails(user.userName, user.passwordHash, true, true, true, true, AuthorityUtils.createAuthorityList("USER"))
    }

}
