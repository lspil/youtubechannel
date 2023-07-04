package com.laurentiuspilca.ssc6.controllers;

import org.springframework.scheduling.annotation.Async;
import org.springframework.security.concurrent.DelegatingSecurityContextExecutorService;
import org.springframework.security.concurrent.DelegatingSecurityContextRunnable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class HelloController {

//	@GetMapping("/hello")
//    @Async
	public String hello2() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		System.out.println(authentication);
		return "Hello " + authentication.getName();
	};

    @GetMapping("/hello")
    @Async
	public String hello() {
		Runnable r = () -> {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

			System.out.println(authentication);
		};
//        DelegatingSecurityContextRunnable dr = new DelegatingSecurityContextRunnable(r);

		ExecutorService service = Executors.newSingleThreadExecutor();
//        DelegatingSecurityContextExecutorService dService =
//                new DelegatingSecurityContextExecutorService(service);

		service.submit(r);
		service.shutdown();

		return "Hello!"; // token
	}
}
