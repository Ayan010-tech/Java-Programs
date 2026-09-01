class invalidAgeException extends RuntimeException {
	invalidAgeException(String msg) {
		super(msg);
	}
}

class validateAge extends Thread {
	int age = 10;

	public void run() {
		if(age < 18) {
			throw new invalidAgeException("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
}

public class threadexample {
	public static void main(String[] args) {
		validateAge t1 = new validateAge();
		t1.start();
	}
}