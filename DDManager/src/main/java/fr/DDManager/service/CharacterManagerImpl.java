package fr.DDManager.service;

import java.util.List;
import java.util.ArrayList;

import fr.DDManager.model.Character;

public class CharacterManagerImpl implements CharacterManager{
	private List<Character> characters;
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public List<Character> getCharacters(){
			return characters;
		}

		public void setCharacters(List<Character> characters) {
			this.characters = characters;
		}
		
}
