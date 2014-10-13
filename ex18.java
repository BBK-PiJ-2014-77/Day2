import java.util.Scanner;
public class ex18
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//ask for n
//calculate double
int i = 0;
System.out.println ("How many iterations?");
String number = System.console().readLine();
int n = Integer.parseInt(number);
double pie = 0.0;
boolean flip = false;
while (i < n ) {
	if (flip == false) { 
	pie = pie + ( 4.0 / ((2 * i) + 1));
	i++;
	flip = true;
	}
	else if (flip == true) {
	pie = pie - ( 4.0 / ((2 * i) + 1));
	i++;
	flip = false;
	}
System.out.println (pie);	
}
System.out.println (pie);


}}

