package temps;

import java.util.Scanner;
import java.util.ArrayList;

public class weekTemp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		
		ArrayList<String> weekDays = new ArrayList<String>();
		ArrayList<Integer> temperatures = new ArrayList<Integer>();
		
		
		weekDays.add("Sunday");
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add("Thursday");
		weekDays.add("Friday");
		weekDays.add("Saturday");
		
		for (int i = 0; i < weekDays.size(); i++) {
			boolean validInput = false;
			int temp = 0;
			
			while(!validInput) {
				System.out.print("Enter the temperature for " + weekDays.get(i) + ": ");
				
				if (scanner.hasNextInt()) {
					temp = scanner.nextInt();
					validInput = true;
				} else {
					System.out.println("Invalid an integer must be input");
					scanner.next();
				}
			}
			temperatures.add(temp);
		}
		
		for(int temp : temperatures) {
			total +=temp;
		}
		double average = (double) total / 7;
		System.out.println("To view daily temps and average,  enter 'week'!");
		String input = scanner.next();
		
		if (input.equalsIgnoreCase("week")) {
			for (int i = 0; i < weekDays.size(); i++) {
				System.out.println(weekDays.get(i) + ": " + temperatures.get(i));
			}
			System.out.println("Average temperature this week: " + average);
		} else {
			System.out.println("Not a valid entry.");
		}
		
		scanner.close();
	}
}
		
				

