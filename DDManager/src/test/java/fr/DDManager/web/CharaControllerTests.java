package fr.DDManager.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import junit.framework.TestCase;
import java.io.IOException;

public class CharaControllerTests extends TestCase {

    protected final Log logger = LogFactory.getLog(getClass());

    public void testHandleRequestView() throws Exception{
        CharaController controller = new CharaController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        
        assertEquals("charas", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }

}