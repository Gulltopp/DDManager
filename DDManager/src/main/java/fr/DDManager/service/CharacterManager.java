package fr.DDManager.service;

import java.io.Serializable;
import java.util.List;

import fr.DDManager.model.Charakter;

public interface CharacterManager extends Serializable{

	public List<Charakter> getCharacters();
	public void addCharacter(Charakter character);
    public void removeCharacter (Integer id);
    public void saveCharacter (Charakter character);
    public Charakter getCharacter(Integer id);
}
