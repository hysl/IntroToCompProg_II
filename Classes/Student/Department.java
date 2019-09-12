/*
Helen Li
February 4, 2019
*/

import java.util.ArrayList;

public class Department
{
	String name;
	ArrayList<Student> students; 

	public Department(String name, ArrayList<Student> students)
	{
		this.name = name;
		this.students = students;
	}

	public ArrayList<Student> getStudents()
	{
		return students;
	}
}
