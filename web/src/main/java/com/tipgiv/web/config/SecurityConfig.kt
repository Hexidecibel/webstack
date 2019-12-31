package com.tipgiv.web.config

import com.tipgiv.web.security.services.UserDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
class SecurityConfig : WebSecurityConfigurerAdapter() {
    @Autowired
    private lateinit var userDetailsService: UserDetailsService
    @Autowired
    private lateinit var passwordEncoder: PasswordEncoder

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/test/*").permitAll().anyRequest().permitAll()
                .antMatchers("/api/*").authenticated()
                .and()
                .logout()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder)
    }
}
