package fr.DDManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import fr.DDManager.dao.CharacterDAO;
import fr.DDManager.model.Charakter;

public class CharacterManagerImpl implements CharacterManager{
	private List<Charakter> characters;
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CharacterDAO characterDAO;

		public List<Charakter> getCharacters(){
			return characters;
		}

		public void setCharacters(List<Charakter> characters) {
			this.characters = characters;
		}
		
		
		@Override
		@Transactional
		public void addCharacter(Charakter character) {
			characterDAO.addCharacter(character);
			
		}

		@Override
		@Transactional
		public void removeCharacter(Integer id) {
			characterDAO.removeCharacter(id);			
		}

		@Override
		@Transactional
		public void saveCharacter(Charakter character) {
			characterDAO.saveCharacter(character);
		}
		
}
