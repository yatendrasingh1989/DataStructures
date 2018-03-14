package com.yaten.poc;

public class ThreadByInterface implements Runnable {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String args[]){
		new Thread(new ThreadByInterface()).start();
	}

}
