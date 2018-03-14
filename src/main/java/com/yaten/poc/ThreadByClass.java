package com.yaten.poc;

public class ThreadByClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("Tread is running.");
		super.run();
	}

	public static void main(String[] args) {
		new ThreadByClass().start();

	}

}
