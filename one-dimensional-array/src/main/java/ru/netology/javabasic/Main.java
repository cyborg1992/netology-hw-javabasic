package ru.netology.javabasic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductCart.printProductPrice();
        ProductCart shoppingCart = new ProductCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Выберите товар и количество или введите \"end\"");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] inputs = input.split(" ");
            int productNumber = Integer.parseInt(inputs[0]);
            int productCount = Integer.parseInt(inputs[1]);
            if (productNumber > 0 && productNumber <= ProductCart.countProducts) {
                shoppingCart.Add(productNumber, productCount);
            } else {
                System.out.println("Товара под таким номером не существует");
            }
        }
        scanner.close();
        System.out.println();
        shoppingCart.printCart();
    }
}