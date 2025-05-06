package com.example.operators.reactor;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

class Order {
    private final String product;
    private final int quantity;
    private final double price;

    public Order(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

public class CustomExample {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Laptop", 2, 1500.0),
                new Order("Mouse", 5, 20.0),
                new Order("Laptop", 1, 1500.0),
                new Order("Keyboard", 3, 100.0)
        );

        Flux.fromIterable(orders)
                .filter(order -> "Laptop".equals(order.getProduct()))
                .map(order -> order.getQuantity() * order.getPrice())
                .doOnNext(total -> System.out.println("Pedido: $" + total))
                .reduce(Double::sum)
                .subscribe(finalTotal -> System.out.println("Total ventas Laptop: $" + finalTotal));
    }
}
