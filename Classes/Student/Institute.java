/*
Helen Li
February 4, 2019
*/

import java.util.ArrayList;

public class Institute
{
	String name;
	ArrayList<Department> departments;

	public Institute(String name, ArrayList<Department> departments)
	{
		this.name = name;
		this.departments = departments;
	}

	public int getTotalStudentsInInstitute()
	{
		int count = 0;

		for(int i = 0; i < departments.size(); i++)
		{
			Department dept = departments.get(i);
			
			ArrayList<Student> students;

			students = dept.getStudents();

			count += students.size();
		}

		return count;

	}
}
