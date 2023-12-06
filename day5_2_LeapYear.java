import java.util.Scanner;
class day5_2_LeapYear{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter year");
int year = sc.nextInt();
if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4-digit year.");
}
	boolean result=(year%4==0&&year %100!=0)||(year%400==0);
if(result)	
{System.out.println("leap year.");}
else
{System.out.println("nonleap year.");
			
}
}
}
			
			
			
			
			
			
			
			
			
        