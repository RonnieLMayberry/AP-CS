/**
 *  Description of the Class
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9, 2006
 *
 */
import java.io.*;
import java.util.*;

public class HeapSort{
  PriorityQueue <Item> myHeapPQ;
  String myFile;

  public HeapSort(){
    this("file20.txt");
  }

  public HeapSort(String fName){
    myHeapPQ = new PriorityQueue <Item>();
    loadFile(fName);
    myFile = fName;
  }

  private void loadFile(String fileName){
    int id, inv;
    Scanner inFile;
	try{
   		inFile = new Scanner(new File(fileName));

    	while(inFile.hasNext()){
    		id = inFile.nextInt();
      		inv = inFile.nextInt();
      		myHeapPQ.add(new Item(id, inv));
    	}
    }catch(IOException i){
    	System.out.println("Error: " + i.getMessage());
    }
  }

  public void sort(){
	System.out.println("sort");
  }
  
}