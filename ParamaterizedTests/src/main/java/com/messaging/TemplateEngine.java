package main.java.com.messaging;

public interface TemplateEngine {

    String prepareMessage(Template msgTemplate, Client client);

}
