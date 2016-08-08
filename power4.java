public class sum {
	public static void main(String args[]){
	//	int count=0;
		int a,c,b;
		int sum=0;
		a=Integer.parseInt(args[0]);
		b=a;
		while(a!=0){
			a=a/10;
			//count++;
		}
		//count--;
		while(b!=0)
		{
			c=b%10;
			sum=sum+(int)Math.pow(c,4);
			b=b/10;
			//count--;
			
		}
		System.out.println(sum);	
		
	}

}
