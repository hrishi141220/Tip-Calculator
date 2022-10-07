package tips;

import java.util.Scanner;

public class Tipcalculator {
	
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);

System.out.println("Bill Total : ");

	float Total=sc.nextFloat();

System.out.println("Tip Percentage : ");

	float TipPercentage=sc.nextFloat();

Total=Total+(Total*(TipPercentage/100));

System.out.println("Total:"+Total);

System.out.println("No of Person : ");

int people=sc.nextInt();

	float Eachperson;

Eachperson=(float) (Total/people);

System.out.println("Each person :"+Eachperson);
	}
}
