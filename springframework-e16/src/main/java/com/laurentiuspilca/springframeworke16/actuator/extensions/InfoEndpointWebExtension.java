package com.laurentiuspilca.springframeworke16.actuator.extensions;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.stereotype.Component;

@Component
@EndpointWebExtension(endpoint = InfoEndpoint.class)
public class InfoEndpointWebExtension {

    @ReadOperation
    public WebEndpointResponse<String> info() {
        return new WebEndpointResponse<>("INFO" , 204);
    }
}
