package com.srhdp.security_register.service;

import org.springframework.security.core.userdetails.UserDetails;

interface UserDetailsService {
    public UserDetails loadUserByUsername(String usernameOrEmail);
}
