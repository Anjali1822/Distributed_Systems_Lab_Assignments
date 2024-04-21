import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject //we will call the methods remotly until server is start 
	implements ServerIntf {
	
		//constructor
		public ServerImpl() throws RemoteException{
		}
        
		//declare all the metehods here
		public String stringJoin(String str1, String str2) throws RemoteException{
			String result = str1 + str2;

			return result;
		}

		public double addition(double n1,double n2) throws RemoteException{
			return n1+n2;
		}
}