package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Accessing our inventory...");
	System.out.println("Please enter the car you're looking for");
	String product = input.nextLine();
	HashMap<String, Integer> car = new HashMap<>();
	car.put("Hyundai Sonata", 2019);
	car.put("Toyota Camry", 2012);
	car.put("Ford Escort", 2018);
	car.put("Chevrolet Malibu", 2014);
	if(car.containsKey(product)) {
        System.out.println("Yeah it's in there");
    }else{
        System.out.println("We don't have it");
    }


    }
}
