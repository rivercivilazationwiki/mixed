import java.util.*;
public class mixed {
	public static void p(String x) {
		System.out.print(x);
	}
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int x=0;
	// Continues program as long as the user wants to
	while (x!=-1) {
		p("Convert improper fraction to mixed number. Input a value for the numerator, which equals a, and the demoninator, which equals b: a/b \n");
		p("a=");
		int n=s.nextInt();
		p("b=");
		int d=s.nextInt();
		int w=n/d; // Retunrs integer divison of numerator and denominator
		int r=n%d; // calculates the remainer
		p("Result: "+w+" "+r+"/"+d+"\n");
		p("Put -1 to end the program, put any other integer to convert another number to a mixed number");
		x=s.nextInt();
	}
	}
}