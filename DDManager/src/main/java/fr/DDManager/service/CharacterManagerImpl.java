package fr.DDManager.service;

import java.util.List;
import java.util.ArrayList;


import fr.DDManager.model.Charakter;

public class CharacterManagerImpl implements CharacterManager{
	private List<Charakter> characters;
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public List<Charakter> getCharacters(){
			return characters;
		}

		public void setCharacters(List<Charakter> characters) {
			this.characters = characters;
		}
		
		public Charakter getCharacterByName(String name){
			for (Charakter chara:characters){
				if (chara.getName().equals(name)){
					return chara;
				}
			}
			return null;
		}
		
}
