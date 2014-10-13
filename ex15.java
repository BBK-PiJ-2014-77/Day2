import java.util.Scanner;
public class ex15
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//make line that thinks of a random number
//print line to guess a number
//convert it
//Loop pick a number unless correct answer
//loop counting up until one from below
//if picked number equals random print CORRECT! 
//if i == random number then print No! my number is Lower
//if i == picked number then print No! my number is Higher

double numberToGuess = Math.abs(1000 * Math.random());
long inttoguess = Math.round(numberToGuess);

long pn = 0; 
int i = 0, choicecounter = 0;
boolean correct = false, step = false;
String Picknumber = "";
while (correct == false) {
	System.out.println ("Please pick a number?");
	Picknumber = System.console().readLine();
	pn = Integer.parseInt(Picknumber);
	while (step == false) {
		if (pn == inttoguess) {
			System.out.println ("CORRECT!");
			step = true;
			correct = true;
		}
		else if (inttoguess == i) {
			System.out.println ("No! my number is Lower");
			step = true;
		}
		else if (pn == i) {
			System.out.println ("No! my number is Higher");
			step = true;	
		}
	i++;
	}
i = 0;
step = false;
choicecounter++;
}
System.out.println ("you had " + choicecounter + " guesses");

}}

