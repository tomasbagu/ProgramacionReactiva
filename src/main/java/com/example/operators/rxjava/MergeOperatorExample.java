package com.example.operators.rxjava;

import io.reactivex.Observable;

public class MergeOperatorExample {
    public static void main(String[] args) {
        Observable<Integer> obs1 = Observable.just(1, 3, 5);
        Observable<Integer> obs2 = Observable.just(2, 4, 6);

        Observable.merge(obs1, obs2)
                .subscribe(result -> System.out.println("Merge: " + result));
    }
}
