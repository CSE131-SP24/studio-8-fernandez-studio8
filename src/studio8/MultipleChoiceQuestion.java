package studio8;

public class MultipleChoiceQuestion extends Question {
	public String[] MultipleChoices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		super(prompt, answer, points);
		String[] MC1 = new String[choices.length];
		MC1 = choices;
		this.MultipleChoices = MC1;
		//Question MC1 = new Question(prompt,answer,points);
		
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	
	public void displayPrompt() {
		//FIXME
		super.displayPrompt();
		for(int i = 1; i <= MultipleChoices.length; i++)
		{
			System.out.println(i+": " + MultipleChoices[i-1]);
		}
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
		System.out.println();
		String[] choices1 = {"Olin", "McKelvey", "Sam Fox","Brown"};
		Question multipleChoice1 = new MultipleChoiceQuestion("What School is the engineering college", "McKelvey", 4, choices1);
		multipleChoice1.displayPrompt();
		System.out.println(multipleChoice1.checkAnswer("Same Fox"));
		System.out.println(multipleChoice1.checkAnswer("Brown"));
		System.out.println(multipleChoice1.checkAnswer("Olin"));
		System.out.println(multipleChoice1.checkAnswer("McKelvey"));



	}

}
