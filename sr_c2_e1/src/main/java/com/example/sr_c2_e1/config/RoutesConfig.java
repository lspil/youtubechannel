package com.example.sr_c2_e1.config;

import com.example.sr_c2_e1.handlers.ProductHandler;
import com.example.sr_c2_e1.model.Product;
import com.example.sr_c2_e1.services.ProductService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class RoutesConfig {

	ProductService productService;
	
	public RoutesConfig(ProductService productService) {
		this.productService = productService;
	}


	@Bean
	public RouterFunction<ServerResponse> router(ProductHandler productHandler) {
//	    return route().GET("/products", req -> ok()
//	    	.contentType(MediaType.TEXT_EVENT_STREAM)
//	    	.body(productService.getAll(), Product.class))
//	    	.build();
    return route().GET("/products", productHandler::getAll)
        .build();
	}
}
