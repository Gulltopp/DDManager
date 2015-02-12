package fr.DDManager.web;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.DDManager.service.CharacterManagerImpl;

public class CharaControllerTests extends TestCase {

	protected final Log logger = LogFactory.getLog(getClass());

	public void testHandleRequestView() throws Exception {
		CharacterController controller = new CharacterController();
		controller.setCharacterManager(new CharacterManagerImpl());

		// TODO
	}

}