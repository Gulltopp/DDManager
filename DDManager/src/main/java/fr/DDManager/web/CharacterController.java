package fr.DDManager.web;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.DDManager.service.CharacterManager;

@Controller
@RequestMapping("/characters")
public class CharacterController {

    protected final Log logger = LogFactory.getLog(getClass());
    private CharacterManager characterManager;

    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("il semble qu'on passe vers la view characters");
        Map<String, Object> myModel = new HashMap<String, Object>();
        logger.info("les persos"+characterManager.getCharacters());
        myModel.put("characters", characterManager.getCharacters());
        return new ModelAndView("characterList", "myModel", myModel);
    }
    
    public ModelAndView handlebis (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("il semble qu'on passe vers la view characters");
        Map<String, Object> myModel = new HashMap<String, Object>();
        logger.info("les persos"+characterManager.getCharacters());
        myModel.put("characters", characterManager.getCharacters());
        return new ModelAndView("characterList", "myModel", myModel);
    }

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}


}