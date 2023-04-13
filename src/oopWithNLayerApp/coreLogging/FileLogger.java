package oopWithNLayerApp.coreLogging;

public class FileLogger implements ILogger {
    public void log(String data){
        System.out.println("Dosyaya loglandı :"+data);
    }
}
