package mediator;


public class Mediator {
	
	
	
	public static void main(String[] args) {
		User u1 =new User("pravin");
		User u2 =new User("praviDsfasfn");
		new ChatRoom().sendMessage(u1, "message1");
		new ChatRoom().sendMessage(u2, "message1");
	}
}

class ChatRoom {
	public void sendMessage(User u, String msg){
		System.out.println(msg + " ["+u.name+"]");
	}
}

class User{
	public String name;
	
	public User(String n){
		name=n;
	}
}
