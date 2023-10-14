package package1;

public class Arithmetic //Class creation--Piller 1
{
	public int Sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("Sum result is "+c);
	return c;
	}
	public int Subtract (int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("Subtract result is "+z);
		return z;
	}
	public void Multi(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("final result is " +a3);
	}
public static void main(String[] args)// piller 2
{
	
	Arithmetic ob=new Arithmetic();//piller 3
	int Sumresult=ob.Sum(12,2);//piller 4
	int Subresult=ob.Subtract(22,2);
	ob.Multi(Sumresult,Subresult);
	
}
}
