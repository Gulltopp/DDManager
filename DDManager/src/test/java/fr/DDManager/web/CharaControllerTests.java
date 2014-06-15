package fr.DDManager.web;

import junit.framework.TestCase;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;

import fr.DDManager.model.Character;
import fr.DDManager.service.CharacterManagerImpl;

public class CharaControllerTests extends TestCase {

    protected final Log logger = LogFactory.getLog(getClass());

    public void testHandleRequestView() throws Exception{
        CharaController controller = new CharaController();
        controller.setCharacterManager(new CharacterManagerImpl());
		
        ModelAndView modelAndView = controller.handleRequest(null, null);
        
        assertEquals("charas", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap=(Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }

}