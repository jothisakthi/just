import java.util.Scanner;


public class PALIN {
public static void main(String args[])
{
	int n=121;
	int a=0;
	while(n!=0){
		a=a*10+n%10;
		n=n/10;
				
	}
	//System.out.println(a);
	if(n==a){
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
