package com.example.sr_c8_e1.handlers;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

@Component
public class CustomWebSocketHandler implements WebSocketHandler {

  private final Sinks.Many<String> sink;

  public CustomWebSocketHandler(Sinks.Many<String> sink) {
    this.sink = sink;
  }

  @Override
  public Mono<Void> handle(WebSocketSession session) {
//    var f = sink.asFlux()
//        .map(s -> session.textMessage(s));

    var f = session.receive()
        .map(e -> e.getPayloadAsText())
        .map(e -> new StringBuilder(e).reverse())
        .map(e -> session.textMessage(e.toString()));

    return session.send(f);
  }
}
