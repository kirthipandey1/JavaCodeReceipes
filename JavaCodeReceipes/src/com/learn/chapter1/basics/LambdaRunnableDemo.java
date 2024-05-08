package com.learn.chapter1.basics;

public class LambdaRunnableDemo {

	public static void main(String[] args) {
		//old way of writing
		new Thread(new Runnable() {
			public void run() {
				System.out.println("inside runnable of anonymous inner class");
			}
		}).start();

		//new way of writing
		new Thread(() -> System.out.println("inside constructor of thread using lambda")).start();
	
		//new way of writing
		Runnable r = () -> System.out.println("implementing lambda using run menthod");
		new Thread(r).start();
		
	}

}
