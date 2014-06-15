package fr.DDManager.web;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import fr.DDManager.service.CharacterManager;

public class CharaController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());
    private CharacterManager characterManager;
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("il semble qu'on passe vers la view characters");

        String now = (new Date()).toString();
        logger.info("la date " + now);
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("characters", this.characterManager.getCharacters());


        return new ModelAndView("charas", "myModel", myModel);
    }

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

}