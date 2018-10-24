package compositeEntity;

import java.util.ArrayList;
import java.util.Hashtable;

public class CompositeEntityPattern{
	
	
	
	public static void main(String[] args) {
		CompositeEntity c=new CompositeEntity();
		c.setData("pravin", "joshi");
		
		System.out.println(c.getData().toString());
	}
}


class Dependent1 {
	String data;
	
	public void setdata(String s){
		data=s;
	}
}

class Dependent2 {
	String data;
	
	public void setdata(String s){
		data=s;
	}
}

class CoarseGrained {
	
	Dependent1 d=new Dependent1();
	Dependent2 d1=new Dependent2();
	
	public void setData(String s1, String s2){
		d1.setdata(s1);
		d.setdata(s2);
	}
	
	public String[] getData(){
		return new String[] {d.data, d1.data};
	}
}



class CompositeEntity {
	CoarseGrained d=new CoarseGrained();
	
	public void setData(String s1, String s2){
		d.setData(s1, s2);
	}
	
	public String[] getData(){
		return d.getData();
	}

	
}