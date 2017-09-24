package com.ameriprise.poc;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 

{
	
	 public void swap (int x, int y) {
         int temp = x;
         x = y;
         y = temp;
}

    public static void main( String[] args )
    {
    	
    	 List<Double> prices = new ArrayList<Double>();
    	 prices.add(new Double(42));
    	 //prices.add(42);
    	 prices.add(new Double(42.0));
    	 prices.add(42.0);
    	// prices.add(new Integer(42));
    	
    	App app = new App();
    	int x=42;
    	int y=24;
    	app.swap(x, y);
        System.out.println( "Hello World!"+x+" "+y );
    }
}
