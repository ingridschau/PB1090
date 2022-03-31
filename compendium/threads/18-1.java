class SleepProgram {
	pblic static void main(String[] args) {
		long sec = 2 * 1000; //two seconds
		System.out.println("Falling asleep...");
		try {

			Thread.sleep(sec);

		} catch (InterruptedException e) {return;}
		System.out.println("Now I am awake."};
	}
}
