import java.util.*;
class Student
{
	String name;
	int age;
	int rn;
	Student()
	{
		rn=0;
	}
	Student(String a, int b, int c)
	{
		name=a;
		age=b;
		rn=c;
	}
}
class Overloading
{
	public static void main(String args[])
	{
		Student s=new Student();
		Student e=new Student("Jewel",19,36);
		System.out.println(e.name + "\t" + e.age + "\t" + e.rn);
		
	}
}