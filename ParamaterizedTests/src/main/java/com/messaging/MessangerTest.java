package main.java.com.messaging;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MessangerTest {
	private static final String CLIENT_EMAIL = "some@email.com";
	private static final String MSG_CONTENT = "Meeting time changed to 11am";
	
	@Test
	public void shouldSendEmail(){
		Template template = mock(Template.class);
		Client client = mock(Client.class);
		MailServer mailServer = mock(MailServer.class);
		TemplateEngine templateEngine = mock(TemplateEngine.class);
		
		Messanger sut = new Messanger(mailServer, templateEngine);
		
		when(client.getEmail()).thenReturn(CLIENT_EMAIL);
		when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);
		sut.sendMessage(client, template);
		
		verify(mailServer).send(CLIENT_EMAIL,MSG_CONTENT);
	}
	
}
