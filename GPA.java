
import java.util.Scanner;

@SuppressWarnings("all")
public class GPA {

	public static void main(String[] args){
		double gpa = 0;
		double input = 0;
		String total = "";
		int classes = 0;
		boolean fail = false;
		do{
			Scanner in = new Scanner (System.in);
			System.out.print("Please enter All class totals in letter form(type stop to stop): ");
			total = in.nextLine();
			total = total.toLowerCase();

			String grades[] = total.split(" ");
			for (String grade : grades){
				if (grade.equals("a")) {
					input = 4.0;
				} else if (grade.equals("b")) {
					input = 3.0;
				} else if (grade.equals("c")) {
					input = 2.0;
				} else if (grade.equals("d")) {
					input = 1.0;
				} else if (grade.equals("f")) {
					fail = true;
					input = 0.0;
				}
				gpa += input;
				classes++;
			}
		}while (!total.equals("stop"));
		System.out.println("Your GPA is: " + gpa + "   ");
		if (gpa >= 2  && classes >= 4 && fail == false){
			System.out.println("Eligible");
		}else if(classes < 4){
			System.out.println("Ineligible, taking less than 4 classes");
		}else if(gpa < 2.0 && fail == false && classes >= 4 ){
			System.out.println("Ineligible, gpa below 2.0");
		}else if(gpa >= 2.0 && fail != false && classes >= 4 ){
			System.out.println("Ineligible, gpa above 2.0 but has F grade (note: gpa >= 2.0");
		}else if(gpa < 2.0 && fail != false && classes >= 4 ){
			System.out.println("Ineligible, gpa below 2.0 and has F grade"); 
		}
	}
}
