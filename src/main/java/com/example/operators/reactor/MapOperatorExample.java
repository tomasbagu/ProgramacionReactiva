package com.example.operators.reactor;

import reactor.core.publisher.Flux;

public class MapOperatorExample {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4, 5)
                .map(item -> item * 2)
                .subscribe(System.out::println);
    }
}
