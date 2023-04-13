package oopWithNLayerApp.coreLogging;

public class MailLogger implements ILogger {
    public void log(String data){
        System.out.println("Mail gönderildi:"+data);
    }
}
