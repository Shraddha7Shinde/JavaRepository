package package1;
//{} This is the boundary or body of the class
public class Student // Classname is student (pillar 1)
{
	int rollNo;// that is a variable it will store integer value
	int age;// that is a variable it will store integer value
	public void display1() //methodname display () indicates this is a method
	{// this is the boundary of the method
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)//pillar 2
	{
		Student shraddha= new Student();// pillar 3
		shraddha.display1();// . is the keyword use for calling the var, method
		shraddha.display2();// . is the keyword use for calling the var, method
		shraddha.rollNo=31;// assigning the value
		shraddha.age=32;// assigning the value
		System.out.println("Roll No: " +shraddha.rollNo);//printing the value
		System.out.println("Age: "+shraddha.age);//printing the value
}

}

