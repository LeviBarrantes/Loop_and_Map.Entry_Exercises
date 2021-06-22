package com.tts;
import java.util.*;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            number.add(sc.nextInt());
        }

        System.out.println("Sum of number in the array: " + sum(number));
        System.out.println("Product of number in the array: " + product(number));

        if(sum(number) > product(number) ){
            System.out.println("The sum number is bigger than product number: " + sum(number));
        }else {
            System.out.println("The sum number is smaller than product number: " + sum(number));
        }

        if(product(number) > sum(number) ){
            System.out.println("The product number is bigger than sum number: " + product(number));
        }else {
            System.out.println("The product number is smaller than sum number: " + product(number));
        }
    }
    public static int sum(ArrayList<Integer> number) {
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        return sum;
    }

    public static int product(ArrayList<Integer> number) {
        int product =1;
        for (int i = 0; i < number.size(); i++) {

            product = product *  Integer.valueOf(number.get(i).toString());


        }
        return product;
    }


}
