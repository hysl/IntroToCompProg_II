/*
Helen Li
March 4, 2019
*/

public class TeamLeader extends ProductionWorker
{
	private double monthlyBonus;
	private double requiredTrainingHours;
	private double trainingHoursAttended;

	public TeamLeader()
	{
		super();
		monthlyBonus = 0.00;
		requiredTrainingHours = 0.00;
		trainingHoursAttended = 0.00;
	}

	public TeamLeader(String name, String employeeNumber, String hireDate, int shift, double payRate, double monthlyBonus, double requiredTrainingHours, double trainingHoursAttended)
	{
		super(name, employeeNumber, hireDate, shift, payRate);
		this.monthlyBonus = monthlyBonus;
		this.requiredTrainingHours = requiredTrainingHours;
		this.trainingHoursAttended = trainingHoursAttended;
	}

	public void setMonthlyBonus(double monthlyBonus)
	{
		this.monthlyBonus = monthlyBonus;
	}

	public String getMonthlyBonus()
	{
		return String.format("%.2f", monthlyBonus);
	}

	public void setRequiredTrainingHours(double requiredTrainingHours)
	{
		this.requiredTrainingHours = requiredTrainingHours;
	}

	public double getRequiredTrainingHours()
	{
		return requiredTrainingHours;
	}

	public void setTrainingHoursAttended(double trainingHoursAttended)
	{
		this.trainingHoursAttended = trainingHoursAttended;
	}

	public double getTrainingHoursAttended()
	{
		return trainingHoursAttended;
	}

	public String toString()
	{
		return super.toString() + "\nMonthly Bonus: $" + getMonthlyBonus() +
			"\nRequired Training Hours: " + getRequiredTrainingHours() +
			"\nTraining Hours Attended: " + getTrainingHoursAttended();
	}
}
