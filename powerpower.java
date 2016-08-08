public  class sum_03{

	public static void main(String args[]){
	int a=Integer.parseInt(args[0]);
	int b=1;
	int sum=0;
	int y=b;
	//int r=0;
	while(a!=0)
/*{
		r=r*10+a%10;
		a=a/10;
	} 
	while(r!=0)*/
	{
	b=a%10;
	sum=sum+(int)Math.pow(b,y);
	a=a/10;
	y=b;
	

	}
	System.out.println(sum);
	}
}
	