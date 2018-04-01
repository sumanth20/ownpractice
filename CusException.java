import java.util.Scanner;

public class CusException {
     int a;
     int b;
     public int add() throws MyException{
        int c;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a value");
        a = sc.nextInt();
        System.out.println("Enter b value");
        b = sc.nextInt();
        
        }catch (Exception e){
        	System.out.println("Exception caught" +e);
        	throw new MyException("Enter integer value only");
        }
    	c= a+b; 
    	System.out.println(c);
    	return c;
    	
     }
     public static void main(String[] args) throws MyException{
    	 CusException ce = new CusException();
    	 ce.add();
     }
}
