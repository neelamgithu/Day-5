import java.util.Scanner;
class day5_1_Coin{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter num of flips");
int flip = sc.nextInt();
if(flip<=0 )
{
System.out.println("only positive numbers plz!!!!!");
} 
int head =0;
int tail =0;
for(int i =0;i<= flip;i++)
{
double result=Math.random();
//System.out.println(result);
if(result <0.5)
{
tail++;
}
else{
head++;
}
}

double headpercentage =(head *100.0)/flip;
double tailpercentage =(tail *100.0)/flip;

System.out.println(headpercentage);
System.out.println(tailpercentage);
}





}