package org.example;

public class Main {
    public static void main(String[] args) {
        Product item = new Product("Клавиатура", 125.50, 4);

        System.out.println("Товар: " + item.getName());
        System.out.println("Цена за шт.: " + item.getPrice() + " руб.");
        System.out.println("Количество: " + item.getQuantity() + " шт.");
        System.out.println("Общая стоимость: " + item.totalCost() + " руб.");

        item.setQuantity(6);
        System.out.println("\nНовое количество: " + item.getQuantity() + " шт.");
        System.out.println("Пересчитанная стоимость: " + item.totalCost() + " руб.");
    }
}