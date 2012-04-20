package com.arne5.creapyweather;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class CreapySound {
	
	
	private static SoundPool sounds;
	private static int cloudysound;
	private static int found;
	private static int next;
	private static MediaPlayer music;
	private static boolean sound = true;//change from false to true right now
	
	public static void loadSound(Context context) {
	   // sound = SilhouPreferences.sound(context); // should there be sound? add this back in for preferences.
	    sounds = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
	    // three ref. to the sounds I need in the application
	    cloudysound = sounds.load(context, R.raw.compute, 1);
	    //found = sounds.load(context, R.raw.accent1, 1); // add more sounds
	   // next = sounds.load(context, R.raw.accent2, 1); //add more sounds
	    // the music that is played at the beginning and when there is only 10 seconds left in a game
	    music = MediaPlayer.create(context, R.raw.itcrowdtheme);
	}
	
	public static void playCloudy() {
        if (!sound) return; // if sound is turned off no need to continue
        sounds.play(cloudysound, 1, 1, 1, 0, 1);
    }
	
	
	/*From the game each sound can be played with a simple call:


	    public static void playSelect() {
	        if (!sound) return; // if sound is turned off no need to continue
	        sounds.play(select, 1, 1, 1, 0, 1);
	    }

	The music is played with this call:


	    public static final void playMusic() {
	        if (!sound) return;
	        if (!music.isPlaying()) {
	        music.seekTo(0);
	        music.start();
	        }
	    }

	The music can be paused (e.g. user would leave the activity) anytime with this call:


	    public static final void pauseMusic() {
	        if (!sound) return;
	        if (music.isPlaying()) music.pause();
	    }

	In the onDestroy method of the activity I call the following method to release all the handles on sound or music objects.


	    public static final void release() {
	        if (!sound) return;
	        sounds.release();
	        music.stop();
	        music.release();
	    }*/

}
