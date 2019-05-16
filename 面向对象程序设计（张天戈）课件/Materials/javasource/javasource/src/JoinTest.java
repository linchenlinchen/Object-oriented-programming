public class JoinTest {
	public static class CharPrinter implements Runnable {
		private char charToPrint; // The character to print
		private int times; // The times to repeat
		private Thread threadToJoin;

		/**
		 * Construct a task with specified character and number of times to
		 * print the character
		 */
		public CharPrinter(char c, int t, Thread threadToJoin) {
			charToPrint = c;
			times = t;
			this.threadToJoin = threadToJoin;
		}

		/**
		 * Override the run() method to tell the system what the task to perform
		 */
		public void run() {
			try {
				for (int i = 0; i < times; i++) {
					System.out.print(charToPrint);
					if (i > 5)
						threadToJoin.join();

				}
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static class NumPrinter implements Runnable {
		private int lastNum;

		/** Construct a task for printing 1, 2, ... i */
		public NumPrinter(int n) {
			lastNum = n;
		}

		/** Tell the thread how to run */
		public void run() {
			for (int i = 1; i <= lastNum; i++) {
				System.out.print(" " + i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable print100 = new NumPrinter(100);
		Thread printTo100Thread = new Thread(print100);

		// Create tasks
		Runnable printA = new CharPrinter('a', 100, printTo100Thread);
		Runnable printB = new CharPrinter('b', 100, printTo100Thread);

		// Create threads
		Thread printAThread = new Thread(printA);
		Thread printBThread = new Thread(printB);

		// Start threads
		printTo100Thread.start();
		printAThread.start();
		printBThread.start();

	}

}
