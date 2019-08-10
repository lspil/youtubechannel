package com.laurentiuspilca.globalsecuritymethodspart1.services;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;

@Service
public class HelloService {

    @Secured({"ROLE_ADMIN", "ROLE_MANAGER"})
    public String sayHello() {
        return "Hello";
    }
}
