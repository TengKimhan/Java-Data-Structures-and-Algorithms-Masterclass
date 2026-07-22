import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many day's temperature? ");
        int day = input.nextInt();
        int[] temps = new int[day];
        int sum = 0;

        // Record day temperature and total temperature
        for (int i=0; i<day; i++){
            System.out.print("Day " + (i+1) + "'s high temperature: ");
            temps[i] = input.nextInt();
            sum+=temps[i];
        }

        double average = (double) sum / day;

        // Count day above average temperature
        int count = 0;
        for (int i=0; i<day; i++){
            if (temps[i] > average) count++;
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(count + " day(s) above average");
    }
}