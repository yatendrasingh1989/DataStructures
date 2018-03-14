package com.yaten.poc.producerconsumer;

import java.util.Vector;

public class ProducerConsumerSolution {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
        Vector sharedQueue = new Vector();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
        prodThread.start();
        consThread.start();
    }

}
