package com.tts;

import java.util.*;

public class DealerShop {
    public static void main(String[] args) {


        Map<String, ArrayList<String>> car = new HashMap();


        car.put("Honda Civic", new ArrayList<String>(Arrays.asList("2011","2009","2008")));
        car.put("Nissan Xterra", new ArrayList<String>(Arrays.asList("2011","2009","2008")));
        car.put("Toyota Tundra", new ArrayList<String>(Arrays.asList("2011","2009")));
        car.put("Ford F150", new ArrayList<String>(Arrays.asList("2011","2009","2008")));
        car.put("Ram 1500", new ArrayList<String>(Arrays.asList("2011","2009","2008")));

        System.out.println("Enter a car name: ");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        if(car.containsKey(input)) {
            System.out.println("Oh, you're looking for a " + input + "?" + " Our Honda selection is right over here...");


            ArrayList<String> list = car.get(input);

            for (String year : list) {
                System.out.println("Model Type " + input + " year " + year);
            }
        }else {

            System.out.println("We current don't have " + input + " in our inventory " );
        }
    }
}
