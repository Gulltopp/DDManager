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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		return "redirect:/index.html";
	}

	@RequestMapping(value = "/delete/{characterId}",method = RequestMethod.GET)
	public String deleteContact(@PathVariable("characterId") Integer characterId) {

		characterManager.removeCharacter(characterId);

		return "redirect:/index.html";
	}
	
	@RequestMapping(value = "/viewChar/{characterId}",method = RequestMethod.GET)
	public String viewChar(@PathVariable("characterId") Integer characterId, Map<String, Object> map) {
		Charakter myChar=characterManager.getCharacter(characterId);
			map.put("charakter",myChar);
	return "viewChar";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateContact(@ModelAttribute("Charakter") Charakter character,
			BindingResult result,Map<String, Object> map) {

		characterManager.saveCharacter(character);
		map.put("charakter",character);
		return "viewChar";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout,
		Map<String, Object> map) {
 
		if (error != null) {
			map.put("error", "Mauvaise combinaison login/pwd");
		}
 
		if (logout != null) {
			map.put("msg", "deconexion reussie");
		}
 
		return "login";
 
	}
	
	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

}