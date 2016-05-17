
public class Word {
    private String myStr;
	private int myCount;
    
	public Word(String str, int count) {
   	 myStr = str;
   	 myCount = count;
	}
    
	public int getCount(){
     	 return myCount;
	}
    
	public String getTheNext(){
   	 return myStr;
	}
    
  	 public int compareTo(Word other){
  		 return this.getCount() - other.getCount();
  	 }

    public boolean equals(Word other){
   	 if(this.getTheNext().equals(other.getTheNext()))
   		 return true;
   	 else
   		 return false;
    }	 
    
	public String toString(){
   	 return myStr;
	}
    
	public void appendf(){
   	 myCount++;
	}
}