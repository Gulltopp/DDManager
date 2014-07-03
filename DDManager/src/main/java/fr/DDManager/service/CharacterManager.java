package fr.DDManager.service;

import java.io.Serializable;
import java.util.List;

import fr.DDManager.model.Charakter;

public interface CharacterManager extends Serializable{

	public List<Charakter> getCharacters();
	public Charakter getCharacterByName(String name);
}
