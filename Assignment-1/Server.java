import java.rmi.*;

public class Server{
	
	public static void main(String[] args){
	
		try{
			ServerImpl serverImpl = new ServerImpl();//ServerImpl cha object created
			Naming.rebind("Server", serverImpl);//Object register in rmi 
			
			System.out.println("Server Started....");
		
		}catch(Exception e){
			System.out.println("Exception Occurred At Server!" + e.getMessage());
		}
	}
	
	
}
