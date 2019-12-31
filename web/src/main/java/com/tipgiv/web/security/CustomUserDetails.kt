package com.tipgiv.web.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails

open class CustomUserDetails(username: String?, password: String?, enabled: Boolean, accountNonExpired: Boolean, credentialsNonExpired: Boolean, accountNonLocked: Boolean, authorities: MutableCollection<out GrantedAuthority>?) : User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities), UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return super.getAuthorities()
    }

    override fun isEnabled(): Boolean {
        return super.isEnabled()
    }

    override fun getUsername(): String {
        return super.getUsername()
    }

    override fun isCredentialsNonExpired(): Boolean {
        return super.isCredentialsNonExpired()
    }

    override fun getPassword(): String {
        return super.getPassword()
    }

    override fun isAccountNonExpired(): Boolean {
        return super.isAccountNonExpired()
    }

    override fun isAccountNonLocked(): Boolean {
        return super.isAccountNonLocked()
    }

}

