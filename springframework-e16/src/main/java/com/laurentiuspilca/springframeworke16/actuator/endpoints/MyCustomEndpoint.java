package com.laurentiuspilca.springframeworke16.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "myendpoint")
public class MyCustomEndpoint {

    @ReadOperation
    public String test() {
        return ":)";
    }
}
