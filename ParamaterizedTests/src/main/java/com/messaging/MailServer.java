package main.java.com.messaging;


public interface MailServer {
    void send(String email, String msgContent);
    void send(Client client, String msgContent);
}
