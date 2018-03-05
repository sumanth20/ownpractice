
public class Idandstatus {
	public boolean status(){
		int	x = 50;
		int y = 100;
		if (x>=y) {
			System.out.println("Pass");
		}
			else {
			System.out.println("fail");
				
			}
		     return true;
		}
		
		public boolean test(){
			int a= 20;
			int b =10;
			boolean res;
			if (a/b == 0){
				res = true;
				System.out.println("Divided" +res);
				return res;
			}
			else 
				res = true;
			    System.out.println("Divided" +res);
				return res;
			
			
		}
			
public static void main(String[] args){
	Idandstatus x = new Idandstatus();
	SampleJava sj = new SampleJava();
	x.test();
	x.status();
}
	
	
	
	
}		

