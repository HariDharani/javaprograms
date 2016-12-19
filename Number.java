import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n==0)
    	   System.out.println("The number is zero");
       else if(n<0)
    	   System.out.println("The given number "+n+" is a negative number");
       else
    	   System.out.println("The given number " +n+ " is a positive number");
	}

}
