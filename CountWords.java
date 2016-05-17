
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

@SuppressWarnings("all")
public class CountWords {
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<Word> b = new ArrayList<Word>();
    String str = "";

    public CountWords() {
    }

    public void parse(String fileName) {
   	 try {
   		 Scanner in = new Scanner(new File(fileName));
   		 while (in.hasNext())
   			 str += in.nextLine() + "\r\n";

   		 Scanner st = new Scanner(str);
   		 while (st.hasNext()) {
   			 String result = checkWord(st.next());
   			 if (result.length() > 0)
   				 a.add(result.toLowerCase());
   		 }
   	 } catch (IOException e) {
   		 System.out.println(e.getMessage());
   	 }
    }

    private String checkWord(String str) {
   	 String result = "";
   	 for (int i = 0; i < str.length(); i++) {
   		 if (Character.isLetter(str.charAt(i)))
   			 result += str.charAt(i);
   		 else {
   			 if (str.length() > 1) {
   				 if (str.charAt(i) == '-' || str.charAt(i) == '\'')
   					 result += str.charAt(i);
   			 }
   		 }
   	 }
   	 return result;
    }

    public void count() {
   	 bubbleSortStr(a);
   	 Word w = new Word(a.get(0), 0);
   	 for (int i = 0; i < a.size(); i++) {
   		 if (w.getTheNext().equals(a.get(i)))
   			 w.appendf();
   		 else {
   			 b.add(w);
   			 w = new Word(a.get(i), 1);
   		 }
   	 }
   	 bubbleSortWord(b);
    }

    public void displayNum() {
   	 System.out.println("Top 30 words used\n");
   	 for (int i = 0; i < 30; i++)
   		 System.out.printf("%5d %5d	%-5s\n", i + 1,
   				 b.get(i).getCount(), b.get(i).getTheNext());

   	 System.out.println("\nNumber of unique words used = " + (b.size() + 1));
   	 System.out.println("Total # of words = " + a.size());
    }

    public void bubbleSortStr(ArrayList<String> list) {
   	 for (int i = 0; i < list.size() - 1; i++) {
   		 for (int j = list.size() - 1; j > i; j--) {
   			 if (list.get(j).compareTo(list.get(j - 1)) < 0) {
   				 swapStr(j, j - 1, list);
   			 }
   		 }
   	 }
    }

    public void swapStr(int indexA, int indexB, ArrayList<String> list) {
   	 String temp = list.get(indexB);
   	 list.set(indexB, list.get(indexA));
   	 list.set(indexA, temp);
    }

    public void bubbleSortWord(ArrayList<Word> list) {
   	 for (int i = 0; i < list.size() - 1; i++) {
   		 for (int j = list.size() - 1; j > i; j--) {
   			 if (list.get(j).compareTo(list.get(j - 1)) > 0) {
   				 swapWord(j, j - 1, list);
   			 }
   		 }
   	 }
    }

    public void swapWord(int indexA, int indexB, ArrayList<Word> list){
   	 Word temp = list.get(indexB);
   	 list.set(indexB, list.get(indexA));
   	 list.set(indexA, temp);
    }
}