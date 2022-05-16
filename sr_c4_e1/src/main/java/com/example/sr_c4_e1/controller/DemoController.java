package com.example.sr_c4_e1.controller;

import com.example.sr_c4_e1.subscribers.DemoSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;
import java.util.stream.Stream;

@RestController
public class DemoController {

  @GetMapping("/demo")
  public void demo() {

      Flux<Integer> f1 = Flux.just(1,2,3,4,5,6);

//    var f2 = Flux.fromStream(Stream.of(1,2,3,4,5,6,7));
//    var f3 = Flux.fromIterable(Set.of(1,2,3,4,5,6,7));
//
//    var m1 = Mono.just(1);
      

//      f1.doOnNext(n -> System.out.println(n));

//      f1.doOnNext(n -> System.out.println(n))
//      	.subscribe(c -> System.out.println("."+c));

//      f1.subscribe(c -> System.out.println(c));

//      f1.subscribe(new DemoSubscriber());
      
      f1.doOnNext(c -> {throw new RuntimeException("Nooooooo");})
        .subscribe(new DemoSubscriber());
  }
}
