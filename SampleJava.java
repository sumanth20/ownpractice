
public class SampleJava {
    public String name = "Sumanth";
    public String id = "11A71A0120";
    private String branch = "civil";
    protected boolean status = false;
    public void main(){
    	System.out.println("Name is " + name + " Kalathuru");
    	
    
    }
    private String branch(){
    	System.out.println("Branch is " + branch);
    	return branch;
    	
  
      }
    
    
  public static void main(String[] args){
	  SampleJava j= new SampleJava();
	  j.main();
	  j.branch();
	  
	  
  }  
    

}
