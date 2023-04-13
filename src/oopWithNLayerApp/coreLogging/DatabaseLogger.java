package oopWithNLayerApp.coreLogging;

public class DatabaseLogger implements ILogger{
    public void  log(String data){
        System.out.println("Veritabanına loglandı :"+data);
    }
}
