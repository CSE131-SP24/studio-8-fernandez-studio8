package studio8;

import java.util.Scanner;

public class Quiz {

	private Question[] questions;
	
	public Quiz(Question[] questions) {
		this.questions = questions;
	}
	
	private String getUserAnswer() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	public int getTotalPoints() {
		int sum = 0;
		for(Question q : questions) {
			sum += q.getPoints();
		}
		return sum;
	}
	
	public void takeQuiz() {
		//FIXME
		for (int i = 1; i <= questions.length; i++)
		{
			questions[i-1].displayPrompt();
			String userAnswer = getUserAnswer();
			System.out.println(questions[i-1].checkAnswer(userAnswer));
		}
		getTotalPoints();
	}
	
	public static void main(String[] args) {
		Question q = new Question("What number studio is this?", "8", 2);

		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);

		choices = new String[] {"instance variables", "git", "methods", "eclipse"};
		Question selectAll = new SelectAllQuestion("Select all of the following that can be found within a class:", "13", choices);

		String[] choices1 = {"Olin", "McKelvey", "Sam Fox","Brown"};
		Question multipleChoice1 = new MultipleChoiceQuestion("What School is the engineering college", "3", 4, choices1);
		
		Question q1 = new Question("How many dalmations are there?", "101", 1);
		
		Question[] questions = {q, multipleChoice, selectAll, multipleChoice1, q1}; //create and add more questions!
		
		Quiz studio8quiz = new Quiz(questions);
		studio8quiz.takeQuiz();
	}
}
