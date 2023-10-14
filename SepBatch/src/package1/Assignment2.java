package package1;

public class Assignment2 
{
	public int sum(int a,int b)
	{
		return a+b;
		}
	public int sub(int a,int b)
	{
		return a-b;
		
	}
	public int multi(int a, int b)
	{
		return a*b;
		
	}
	public int div(int a, int b)
	{
		return a/b;}
	public static void main(String[] args) 
	{
		Assignment2 obj= new Assignment2();
		System.out.println("Here's my first Arithmetic Assignment!!");
		int sumresult=obj.sum(10,2);
		System.out.println("Sum1 is "+sumresult);
		int sumresult2=obj.sum(sumresult,2);
		System.out.println("Sum2 is "+sumresult2);
		int subresult=obj.sub(sumresult2,2);
		System.out.println("Sub is "+subresult);
		int multiresult=obj.multi(subresult,2);
		System.out.println("Multi is "+multiresult);
		int divresult=obj.div(multiresult,2);
	System.out.println("Div is " +divresult);
	}


}

