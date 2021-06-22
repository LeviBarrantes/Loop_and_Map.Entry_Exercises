package com.tts;

import java.util.*;

public class DealerShop {
    public static void main(String[] args) {


        Map<String, ArrayList<String>> car = new HashMap();


        car.put("Honda", new ArrayList<String>(Arrays.asList(" Civic 2011","Civic 2009"," Civic 2008")));
        car.put("Nissan", new ArrayList<String>(Arrays.asList(" Xterra 2011","Titan 2009","Murano 2008")));
        car.put("Toyota", new ArrayList<String>(Arrays.asList(" Tundra 2011","Tacoma 2009")));
        car.put("Ford", new ArrayList<String>(Arrays.asList("F150 2020", " Ranger 2019 ")));
        car.put("Mercedes Benz", new ArrayList<String>(Arrays.asList(" CLA 2011","CS 2009","S 2008")));

        System.out.println("Enter a car name: ");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        if(car.containsKey(input)) {
            System.out.println("Oh, you're looking for a " + input + "?" + " Our Honda selection is right over here...");


            ArrayList<String> list = car.get(input);

            for (String year : list) {
                System.out.println("Model Type " + input  + year);
            }
        }else {

            System.out.println("We current don't have " + input + " in our inventory " );
        }
    }
}
