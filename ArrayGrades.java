//**********************************
//COSC 1336 CS1
//Name: Jalen McCarthy
//Date: 10/15/21
//Reads Student Grades By using Arrays
//**********************************
import java.util.Scanner;
public class ArrayGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Create Variables
	double average = 0;
	
	//Create Scanner Class
	Scanner input = new Scanner(System.in);
	
	//Prompt User to Enter Number of Students
	System.out.print("Enter the number of students: ");
	int[] Scores = new int[input.nextInt()];
	char[] Grades = new char[Scores.length];
	
	//Prompt User to Enter 4 Scores
	System.out.print("Enter " + Scores.length + " scores: ");
	for (int i = 0; i < Scores.length; i++)  {
	 Scores[i] = input.nextInt();
	}
	
	//Get Grades for Students
	getGrades(Scores, Grades);
	
	//Display Results
	for (int i = 0; i < Scores.length; i++) {
	System.out.println("Student " + i + " score is " + Scores[i] + " and grade"
	+ " is " + Grades[i]); }
	
	//Display Average Score
	for (int i = 0; i < Scores.length; i++) {
	    average += Scores[i];
	}
	
	System.out.println("The average score is: " + (average/Scores.length));
	int Above_Avg = 0, Below_Avg = 0;
	for (int i = 0; i<Scores.length; i++) {
	if (Scores[i] >= (average/Scores.length))
	Above_Avg++;
	else
	Below_Avg++;
	}
	System.out.println("There are " + Above_Avg + " students whose grade is above"
	+ " and equal to average.");
	System.out.println("There are " + Below_Avg + " students whose grade is below average."); }
	
	
	//Return highest score using method
	public static int max(int[] array) {
	int max = array[0];
	for (int i =0; i < array.length; i++) {
		if (array[i] > max)
			max = array[1];
	}
	return max;
	}
	//Assign Grade to Students using method
	public static int getGrades(int[] Scores, char[] Grades) {
	int best = max(Scores);
	for (int i = 0; i < Scores.length; i++) {
		if (Scores[i] >= best - 10)
			Grades[i] = 'A';
		else if (Scores[i] >= best - 20)
			Grades[i] = 'B';
		else if (Scores[i] >= best - 30)
			Grades[i] = 'C';
		else if (Scores[i] >= best - 40)
			Grades[i] = 'D';
		else 
			Grades[i] = 'F';
		
			}
	return best;
	
	}
	
}