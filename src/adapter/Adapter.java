package adapter;

import java.util.ArrayList;
import java.util.Hashtable;

public class Adapter{
	
	
	
	public static void main(String[] args) {
			IMediaPlayer x = new MediaPlayer();
			x.play("mp3");
			x.play("mp4");
			x.play("vlc");
	}
}

interface IMediaPlayer {
	void play(String format);
}

interface IAdvMediaPlayer {
	void playmp4();
	void playvlc();
}

class AdvMediaPlayer implements IAdvMediaPlayer {

	@Override
	public void playmp4() {
		// TODO Auto-generated method stub
		System.out.println("mp4 playing");
	}

	@Override
	public void playvlc() {
		// TODO Auto-generated method stub
		System.out.println("vlc playing");
	}
	
}

class MediaPlayer implements IMediaPlayer {

	@Override
	public void play(String format) {
		// TODO Auto-generated method stub
		if(format=="mp3"){
			System.out.println(" i can play mp3..playying");
		}
		else if(format =="vlc" || format=="mp4"){
			IMediaPlayer adp = new AdvPlayerAdapter();
			adp.play(format);
		}
	}
	
}


class AdvPlayerAdapter implements IMediaPlayer {

	@Override
	public void play(String format) {
		// TODO Auto-generated method stub
		if(format == "mp4"){
			IAdvMediaPlayer adv = new AdvMediaPlayer();
			adv.playmp4();
		}
		else if(format == "vlc"){
			IAdvMediaPlayer adv = new AdvMediaPlayer();
			adv.playvlc();
		}
	}
	
} 