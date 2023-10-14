package package1;
//{} This is the boundary or body of the class
// pillar1-- Class Creation-- A Class contains Variable + method
// What is variable ?-- Which store some value & value can be changed
//What is method?-- For performing any actions or Operations we create method for it.

public class Student1 // Classname is student (pillar 1)
{
	int a ;// that is a variable it will store integer value
	public void display ()//methodname display () indicates this is a method
	{// this is the boundary of the method
		System.out.println("Welcome all of you");
	}
	public static void main(String[] args) //pillar 2
	{//boundary of the main method
		Student1 shraddha=new Student1();//pillar 3
		shraddha.display();// . is the keyword use for calling the var, method
		shraddha.display(); 
		shraddha.a=123;// assigning the value
		System.out.println(shraddha.a);//printing the value
		shraddha.a=321;
		System.out.println(shraddha.a);
		
	}

}
