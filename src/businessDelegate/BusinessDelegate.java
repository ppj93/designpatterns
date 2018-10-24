package businessDelegate;

import java.util.ArrayList;
import java.util.Hashtable;

public class BusinessDelegate{
	
	
	
	public static void main(String[] args) {
		BusinessDelegateClass s= new BusinessDelegateClass();
		s.setServiceType("A");
		Client c=new Client(s);
		c.doTask();
	}
}

interface IBusinessService {
	void process();
}

class AService implements IBusinessService {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("A service processing");
	}
	
}

class BService implements IBusinessService {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("B service processing");
	}
}

class ServiceLoopup {
	public IBusinessService getService(String name){
		if(name.equalsIgnoreCase("A"))
			return new AService();
		return new BService();
	}
}

class BusinessDelegateClass {
	ServiceLoopup s=new ServiceLoopup();
	
	String serviceType;
	
	public void setServiceType(String s){
		serviceType = s;
	}
	
	public void doTask(){
		s.getService(serviceType).process();
	}
}

class Client {
	BusinessDelegateClass c;
	
	public Client(BusinessDelegateClass cs){
		c=cs;
	}
	
	public void doTask(){
		c.doTask();
	}
}