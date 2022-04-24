package ru.netology.javabasic;

public class ProductCart {

    public int[] cart;
    public boolean cartEmpty;
    public static String[] products = {
            "Хлеб",
            "Яблоки",
            "Молоко",
            "Мясо",
            "Яйцо",
            "Сахар"};
    public static int[] prices = {40, 100, 70, 400, 80, 55};
    public static int countProducts = products.length;

    public ProductCart() {
        cart = new int[countProducts];
        cartEmpty = true;
    }

    public void Add(int productNumber, int productCount) {
        cart[productNumber - 1] += productCount;
        cartEmpty = false;
    }

    public static void printProductPrice() {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < countProducts; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
    }

    public int totalPrice() {
        int sumProducts = 0;
        for (int i = 0; i < countProducts; i++) {
            sumProducts += cart[i] * prices[i];
        }
        return sumProducts;
    }

    public void printCart() {
        if (cartEmpty) {
            System.out.println("Ваша корзина пуста");
        } else {
            System.out.printf("Ваша корзина:\n%-23s%-14s%-15s%s\n",
                    "Наименование товара",
                    "Количество",
                    "Цена/за ед.",
                    "Общая стоимость");

            for (int i = 0; i < countProducts; i++) {
                if (cart[i] != 0) {
                    System.out.printf("%-23s%-14d%-15d%d\n",
                            products[i],
                            cart[i],
                            prices[i],
                            cart[i] * prices[i]);
                }
            }
            System.out.printf("%52s%s\n", "Итого:         ", totalPrice());
        }
    }
}