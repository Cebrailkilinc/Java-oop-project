import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.coreLogging.DatabaseLogger;
import oopWithNLayerApp.coreLogging.FileLogger;
import oopWithNLayerApp.coreLogging.ILogger;
import oopWithNLayerApp.coreLogging.MailLogger;
import oopWithNLayerApp.dataAccsess.HibernateProductDao;
import oopWithNLayerApp.dataAccsess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Iphone 14 Pro", 10000);

        ILogger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};
        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}