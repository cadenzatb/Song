package Trubby.co.th;

import org.bukkit.Sound;

public class Pitch {

	public static float getPitchFromText(String note){
		
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
		case "BG3": return 1.6f;
		case "BA": return 1.669f;
		case "BA#": return 1.78f;
		case "BB": return 1.9f;
		case "BCC": return 2f;
		default: break;
		}
		
		return 0f;
	}
	
public static Sound getInstrument(String note){
		
		switch (note) {
		case "c": return Sound.NOTE_PIANO;
		case "c#": return Sound.NOTE_PIANO;
		case "d": return Sound.NOTE_PIANO;
		case "d#": return Sound.NOTE_PIANO;
		case "e": return Sound.NOTE_PIANO;
		case "f": return Sound.NOTE_PIANO;
		case "f#": return Sound.NOTE_PIANO;
		case "g": return Sound.NOTE_PIANO;
		case "g#": return Sound.NOTE_PIANO;
		case "a": return Sound.NOTE_PIANO;
		case "a#": return Sound.NOTE_PIANO;
		case "b": return Sound.NOTE_PIANO;
		case "C": return Sound.NOTE_PIANO;
		case "C#": return Sound.NOTE_PIANO;
		case "D": return Sound.NOTE_PIANO;
		case "D#": return Sound.NOTE_PIANO;
		case "E": return Sound.NOTE_PIANO;
		case "F": return Sound.NOTE_PIANO;
		case "F#": return Sound.NOTE_PIANO;
		case "G": return Sound.NOTE_PIANO;
		case "G3": return Sound.NOTE_PIANO;
		case "A": return Sound.NOTE_PIANO;
		case "A#": return Sound.NOTE_PIANO;
		case "B": return Sound.NOTE_PIANO;
		case "CC": return Sound.NOTE_PIANO;
		
		//BASS
		case "Bc": return Sound.NOTE_BASS;
		case "Bc#": return Sound.NOTE_BASS;
		case "Bd": return Sound.NOTE_BASS;
		case "Bd#": return Sound.NOTE_BASS;
		case "Be": return Sound.NOTE_BASS;
		case "Bf": return Sound.NOTE_BASS;
		case "Bf#": return Sound.NOTE_BASS;
		case "Bg": return Sound.NOTE_BASS;
		case "Bg#": return Sound.NOTE_BASS;
		case "Ba": return Sound.NOTE_BASS;
		case "Ba#": return Sound.NOTE_BASS;
		case "Bb": return Sound.NOTE_BASS;
		case "BC": return Sound.NOTE_BASS;
		case "BC#": return Sound.NOTE_BASS;
		case "BD": return Sound.NOTE_BASS;
		case "BD#": return Sound.NOTE_BASS;
		case "BE": return Sound.NOTE_BASS;
		case "BF": return Sound.NOTE_BASS;
		case "BF#": return Sound.NOTE_BASS;
		case "BG": return Sound.NOTE_BASS;
		case "BG3": return Sound.NOTE_BASS;
		case "BA": return Sound.NOTE_BASS;
		case "BA#": return Sound.NOTE_BASS;
		case "BB": return Sound.NOTE_BASS;
		case "BCC": return Sound.NOTE_BASS;
		default: break;
		}
		
		return null;
	}
}
