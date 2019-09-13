/*
Helen Li
February 18, 2019
*/

public class Student extends Person
{
	private int numCourses;
	private String[] courses;
	private int[] grades;

	final int MAX_COURSES = 5;

	// constructor
	public Student(String name, String address)
	{
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}

	// check if course already exists
	// check if max courses reached
	// else, add course
	public void addCourseGrade(String course, int grade)
	{
		if(numCourses == MAX_COURSES)
		{
			System.out.println("Maximum number of courses " + MAX_COURSES + " reached.");
			System.out.println("Course " + course + " cannot be added.");
			return;
		}

		if(numCourses == 0)
		{
			courses[numCourses] = course;
			grades[numCourses] = grade;
			numCourses++;
			System.out.println(course + "\t" + grade + " added.");
			return;
		}

		for(int i = 0; i < numCourses; i++)
		{
			if(courses[i] == course)
			{
				System.out.println(course + " is already in.");
				return;
			}
		}

		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
		System.out.println(course + "\t" + grade + " added.");
	}

	public void printGrades()
	{
		for(int i = 0; i < numCourses; i++)
		{
			System.out.println(courses[i] + "\t" + grades[i]);
		}
	}

	public double getAverageGrade()
	{
		double sum = 0;

		for(int i = 0; i < numCourses; i++)
		{
			sum += grades[i];
		}

		return (sum / numCourses);
	}

	public String toString()
	{
		return "Student: " + getName() + " (" + getAddress() + ")";
	}
}
