package com.example.operators.rxjava;

import io.reactivex.Observable;

public class ZipOperatorExample {
    public static void main(String[] args) {
        Observable<Integer> obs1 = Observable.just(1, 2, 3);
        Observable<String> obs2 = Observable.just("A", "B", "C");

        Observable.zip(obs1, obs2, (num, letter) -> num + letter)
                .subscribe(result -> System.out.println("Zip: " + result));
    }
}
