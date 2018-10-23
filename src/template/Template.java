package template;

import java.util.ArrayList;
import java.util.Hashtable;

public class Template{
	
	
	
	public static void main(String[] args) {

		GameTemplate cri = new Cricket();
		cri.playGame();
		
		GameTemplate foot = new Football();
		foot.playGame();
		
	}
}

abstract class GameTemplate {
	abstract void doPreGameActivities();
	abstract void play();
	abstract void doPresentation();
	
	public void playGame(){
		doPreGameActivities();
		play();
		doPresentation();
	}
}

class Cricket extends GameTemplate
{

	@Override
	public void doPreGameActivities() {
		// TODO Auto-generated method stub
		System.out.println("cricket: toss time!!");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("GAME ONNNNN");

	}

	@Override
	public void doPresentation() {
		// TODO Auto-generated method stub
		System.out.println("Ravi shastriii ..presenting!!!!");
	
	}
}


class Football extends GameTemplate
{

	@Override
	public void doPreGameActivities() {
		// TODO Auto-generated method stub
		System.out.println("Football: toss time!!");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("maramari - dhavadhavi chalu aahe..Game nahii!!");

	}

	@Override
	public void doPresentation() {
		// TODO Auto-generated method stub
		System.out.println("some timepass spresentions");
	
	}
}