package com.yaten.poc;

import java.util.ArrayList;
import java.util.List;

public class Tree extends Plant{

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		List<Plant> plants = new ArrayList<Plant>();
		plants.add(new Plant());
		List<? extends Plant> trees = plants;
		  Plant plant = trees.get(0);
		  
		  Class theclass = Class.forName("Plant");
		  Object obj = theclass.newInstance();
		  
	}

}
