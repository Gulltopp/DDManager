package fr.DDManager.service;

import java.io.Serializable;
import java.util.List;
import fr.DDManager.model.Character;

public interface CharacterManager extends Serializable{

	public List<Character> getCharacters();
}
