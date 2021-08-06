package practice;

public class SortObjects {
 String name;
int Age;
int Salary;
SortObjects(String name,int Age,int Salary)
{
	this.name= name;
	this.Age= Age;
	this.Salary=Salary;
}
public String toString() {
	return this.name+" "+this.Age+" "+this.Salary;
}
	
}
