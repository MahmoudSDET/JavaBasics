package javaBasics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("counters: i = " + i + ", j = " + j);
		}*/
		
		
		
		System.out.println("=========== continue");
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("counter: " + i);
		}
		
		System.out.println("=========== break");
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("counter: " + i);
		}
		
		System.out.println("=========== break nested loop");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {	
					break;
				}
				System.out.print(j + " ");
			}
			
			System.out.println("counter: " + i);
		}
	}

}
