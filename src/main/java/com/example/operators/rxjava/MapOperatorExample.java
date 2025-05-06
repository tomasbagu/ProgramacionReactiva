package com.example.operators.rxjava;

import io.reactivex.Observable;

public class MapOperatorExample {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5)
                .map(item -> item * 2)
                .subscribe(result -> System.out.println("Map: " + result));
    }
}
