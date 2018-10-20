package proxy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class Proxy {
	
	
	
	public static void main(String[] args) {

		new ExternalServiceProxy().met();
	}
	
}

//this is pms
class ExternalService{
	public void met(){
	System.out.println("met");	
	}
}



//this is bpc service project ethod
class ExternalServiceProxy{
	public void met() {
		System.out.println("proxy met");	
		new ExternalService().met();
	}
}