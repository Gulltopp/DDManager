package fr.DDManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.DDManager.dao.CharacterDAO;
import fr.DDManager.model.Charakter;

@Service
public class CharacterManagerImpl implements CharacterManager{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CharacterDAO characterDAO;

		@Transactional
		public List<Charakter> getCharacters(){
			return characterDAO.listCharacters();
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
