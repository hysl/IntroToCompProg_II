/*
Helen Li
February 18, 2019
*/

public class Teacher extends Person
{
	private int numCourses;
	private String[] courses;

	final int MAX_COURSES = 4;

	// constructor
	public Teacher(String name, String address)
	{
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}

	// check if max courses reached
	// check if course already exists
	// else, add course
	public boolean addCourse(String course)
	{
		if(numCourses == MAX_COURSES)
		{
			System.out.println("Maximum number of courses " + MAX_COURSES + " reached.");
			return false;
		}

		for(int i = 0; i < numCourses; i++)
		{
			if(courses[i] == course)
			{
				System.out.println(course + " is already in.");
				return false;
			}
		}

		courses[numCourses] = course;
		numCourses++;

		return true;
	}

	// check if course exists. If so, remove course and decrement numCourses
	// if course does not exist, return false
	public boolean removeCourse(String course)
	{
		for(int i = 0; i < numCourses; i++)
		{
			if(courses[i] == course)
			{
				for(int j = i; j < numCourses - 1; j++)
				{
					courses[j] = courses[j + 1];
				}
				numCourses--;
				System.out.println(course + " removed.");
				return true;
			}
		}

		System.out.println(course + " not found. Cannot be removed.");
		return false;
	}

	public void printCourses()
	{
		for(int i = 0; i < numCourses; i++)
		{
			System.out.print(courses[i] + "\t");
		}

		System.out.println();
	}

	public String toString()
	{
		return "Teacher: " + getName() + " (" + getAddress() + ")";
	}
}
