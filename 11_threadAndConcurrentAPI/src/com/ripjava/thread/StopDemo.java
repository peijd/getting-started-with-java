package com.ripjava.thread;

class SomeRunner implements Runnable {

	private boolean isContinue = true;

	public void stop() {
		isContinue = false;
	}

	@Override
	public void run() {
		while (isContinue) {
			try {
				Thread.sleep(50);
				System.out.println("SomeRunner");
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
};

public class StopDemo {
	public static void main(String[] args) throws InterruptedException {
		SomeRunner someRunner = new SomeRunner();
		Thread thread = new Thread(someRunner);
		thread.start();
		Thread.sleep(1000);
		someRunner.stop();
	}

}
