package fr.DDManager.dao;

import java.util.List;

import fr.DDManager.model.Charakter;

public interface CharacterDAO {

	public void addCharacter(Charakter character);
	public List<Charakter> listCharacters();
	public void removeCharacter (Integer id);
	public void saveCharacter (Charakter character);
	public Charakter getcharacter(Integer id);
}
