package iterator;

public class Iterator{
	
	public static void main(String[] args) {
		IIterator i = new NameCollection().getIterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}

interface IIterator 
{
	boolean hasNext();
	Object next();
}

class NameCollection {

	public String s[] = {"adsfads", "sdf", "uyy"};
	
	
	public IIterator getIterator() {
		return new CollectionIterator();
	}
	private class CollectionIterator implements IIterator {

		private int index=0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index!=s.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			index++;
			return s[index-1];
		}
	}
	
}