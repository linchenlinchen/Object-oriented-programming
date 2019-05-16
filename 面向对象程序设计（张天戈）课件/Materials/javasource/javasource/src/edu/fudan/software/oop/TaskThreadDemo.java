package edu.fudan.software.oop;

public class TaskThreadDemo {

	public static void main(String args[]) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						System.out.print("a ");
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						System.out.print("b ");
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						System.out.print(i+" ");
						Thread.sleep(50);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();	
	}
}
