package Trubby.co.th;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

public class SongTask extends BukkitRunnable{
	
	World world;
	Location loc;
	int count;
	
	public ArrayList<String> soprano = new ArrayList<>();
	public ArrayList<String> bass = new ArrayList<>();
	
	public SongTask(World world, Location loc){
		this.loc = loc;
		this.world = world;
		this.count = 0;
		
		soprano.add("E b");	// ------------- 1
		soprano.add("");
		soprano.add("");
		soprano.add("");
		soprano.add("b g#");
		soprano.add("");
		soprano.add("C a");
		soprano.add("");
		soprano.add("D b");	// ------------- 2
		soprano.add("");
		soprano.add("E");	
		soprano.add("D");
		soprano.add("C a");
		soprano.add("");
		soprano.add("b g#");
		soprano.add("");
		soprano.add("a e");	// ------------- 3
		soprano.add("");
		soprano.add("");	
		soprano.add("");
		soprano.add("a e");
		soprano.add("");
		soprano.add("C a");
		soprano.add("");
		soprano.add("E C");	// ------------- 4
		soprano.add("");
		soprano.add("");	
		soprano.add("");
		soprano.add("D b");
		soprano.add("");
		soprano.add("C a");
		soprano.add("");
		soprano.add("b g#");	// ------------- 5
		soprano.add("");
		soprano.add("");	
		soprano.add("");
		soprano.add("b");
		soprano.add("");
		soprano.add("C a");
		soprano.add("");
		soprano.add("D b");	// ------------- 6
		soprano.add("");
		soprano.add("");	
		soprano.add("");
		soprano.add("E C");
		soprano.add("");
		soprano.add("");
		soprano.add("");
		soprano.add("C a");	// ------------- 7
		soprano.add("");
		soprano.add("");	
		soprano.add("");
		soprano.add("a e");
		soprano.add("");
		soprano.add("");
		soprano.add("");
		soprano.add("a e");	// ------------- 8
		
		/** 
		 *  BASS
		 */
		bass.add("Be");	// ------------- 1
		bass.add("");
		bass.add("BE");
		bass.add("");
		bass.add("Be");
		bass.add("");
		bass.add("BE");
		bass.add("");
		bass.add("Be");	// ------------- 2
		bass.add("");
		bass.add("BE");
		bass.add("");
		bass.add("Be");
		bass.add("");
		bass.add("BE");
		bass.add("");
		bass.add("Ba");	// ------------- 3
		bass.add("");
		bass.add("BA");
		bass.add("");
		bass.add("Ba");
		bass.add("");
		bass.add("BA");
		bass.add("");
		bass.add("Ba");	// ------------- 4
		bass.add("");
		bass.add("BA");
		bass.add("");
		bass.add("Ba");
		bass.add("");
		bass.add("BA");
		bass.add("");
		bass.add("Bg#");	// ------------- 5
		bass.add("");
		bass.add("BG#");
		bass.add("");
		bass.add("Bg#");
		bass.add("");
		bass.add("BG#");
		bass.add("");
		bass.add("Be");	// ------------- 6
		bass.add("");
		bass.add("BE");
		bass.add("");
		bass.add("Be");
		bass.add("");
		bass.add("BE");
		bass.add("");
		bass.add("Ba");	// ------------- 7
		bass.add("");
		bass.add("BA");
		bass.add("");
		bass.add("Ba");
		bass.add("");
		bass.add("BA");
		bass.add("");
		bass.add("Ba");	// ------------- 8
		
		
		
	}
	
	@Override
	public void run() {
		if(count < soprano.size()){
			String play = soprano.get(count);
			if(play != ""){
				//Multiple sound
				if(play.length() > 1){
					for(String str : soprano.get(count).split(" ")){
						world.playSound(loc, Sound.NOTE_PIANO, 1, getPitchFromText(str));
					}
					
				}else{ //Single sound
					world.playSound(loc, Pitch.getInstrument(play), 1, getPitchFromText(play));
				}
			}
			
			String bassplay = bass.get(count);
			if(bassplay != ""){
				//Only Single sound
				world.playSound(loc, Sound.NOTE_BASS, 0.3f, getPitchFromText(bassplay));
			}
			
			count++;
		}else{
			this.cancel();
		}
	}
	
	public float getPitchFromText(String note){
		
		switch (note) {
		case "c": return 0.5f;
		case "c#": return 0.53f;
		case "d": return 0.56f;
		case "d#": return 0.6f;
		case "e": return 0.63f;
		case "f": return 0.67f;
		case "f#": return 0.7f;
		case "g": return 0.76f;
		case "g#": return 0.8f;
		case "a": return 0.84f;
		case "a#": return 0.9f;
		case "b": return 0.94f;
		case "C": return 1f;
		case "C#": return 1.051f;
		case "D": return 1.12f;
		case "D#": return 1.19f;
		case "E": return 1.26f;
		case "F": return 1.32f;
		case "F#": return 1.415f;
		case "G": return 1.51f;
		case "G3": return 1.6f;
		case "A": return 1.669f;
		case "A#": return 1.78f;
		case "B": return 1.9f;
		case "CC": return 2f;
		
		//BASS
		case "Bc": return 0.5f;
		case "Bc#": return 0.53f;
		case "Bd": return 0.56f;
		case "Bd#": return 0.6f;
		case "Be": return 0.63f;
		case "Bf": return 0.67f;
		case "Bf#": return 0.7f;
		case "Bg": return 0.76f;
		case "Bg#": return 0.8f;
		case "Ba": return 0.84f;
		case "Ba#": return 0.9f;
		case "Bb": return 0.94f;
		case "BC": return 1f;
		case "BC#": return 1.051f;
		case "BD": return 1.12f;
		case "BD#": return 1.19f;
		case "BE": return 1.26f;
		case "BF": return 1.32f;
		case "BF#": return 1.415f;
		case "BG": return 1.51f;
		case "BG#": return 1.6f;
		case "BA": return 1.669f;
		case "BA#": return 1.78f;
		case "BB": return 1.9f;
		case "BCC": return 2f;
		default: break;
		}
		
		return 5f;
	}
}
