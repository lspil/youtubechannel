package com.example.sr_c4_e1.controller;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import publishers.DemoPublisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import subscribers.DemoSubscriber;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

@RestController
public class DemoController {

  @GetMapping("/demo")
  public void demo() {

//      DemoPublisher f1 = new DemoPublisher(List.of(1,2,3,4,5,6));		// custom publisher

	  Flux<String> f1 = Flux.create(  s -> {		// sink
		 for (int i=0; i<10; i++) {
			 s.next(UUID.randomUUID().toString());
		 }
		 s.complete();
		 // s.error(null);
	  });
	  
      f1.log()
      	.subscribe(c -> System.out.println(c));							// request(indefinite)
  }
}
