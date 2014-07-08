package fr.DDManager.web;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.DDManager.model.Charakter;
import fr.DDManager.service.CharacterManager;

@Controller
public class CharacterController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private CharacterManager characterManager;

	@RequestMapping("/index")
	public String listContacts(Map<String, Object> map) {

		map.put("charakter", new Charakter());
		map.put("charakterList", characterManager.getCharacters());

		return "characterList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("charakter") Charakter character,
			BindingResult result) {

		characterManager.addCharacter(character);
		return "redirect:/index";
	}

	@RequestMapping("/delete/{characterId}")
	public String deleteContact(@PathVariable("characterId") Integer characterId) {

		characterManager.removeCharacter(characterId);

		return "redirect:/index";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateContact(
			@ModelAttribute("Charakter") Charakter character,
			BindingResult result) {

		characterManager.saveCharacter(character);
		return "redirect:/index";
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

}