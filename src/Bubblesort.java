import java.util.Random;
import java.util.Scanner;

public class Bubblesort {

	static Random rn = new Random();
	
	public static void main(String[] args) {
		System.out.println("Bubblesort");
		System.out.println("==========");
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie eine Natürliche Zahl für die Anzahl an Stellen in einem Array an: ");
		int x = sc.nextInt();
		int[] unsortiert = new int[x]; 
		sc.close();
		
		for (int i = 0; i < unsortiert.length; i++) {
			unsortiert[i] = rn.nextInt(); 
	       System.out.println(unsortiert[i]);
	    }	
		System.out.println(" ");
		System.out.println("Sortiert nach Bubblesort: ");
		int[] sortiert=bubblesort(unsortiert);
		System.out.println(" ");
		
		for (int i = 0; i<sortiert.length; i++) {
			System.out.print(sortiert[i] + ", ");
		}
	
	}
		public static int[] bubblesort(int[] zusortieren) {
			int temp;
			final long timeStart = System.currentTimeMillis();
			for(int i=1; i<zusortieren.length; i++) {
				for(int j=0; j<zusortieren.length-i; j++) {
					if(zusortieren[j]>zusortieren[j+1]) {
						temp=zusortieren[j];
						zusortieren[j]=zusortieren[j+1];
						zusortieren[j+1]=temp;
					}
					
				}
			}
			final long timeEnd = System.currentTimeMillis();
			System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " ms");
			return zusortieren;
		}
}
