package oopWithNLayerApp.business;

import oopWithNLayerApp.coreLogging.ILogger;
import oopWithNLayerApp.dataAccsess.HibernateProductDao;
import oopWithNLayerApp.dataAccsess.IProductDao;
import oopWithNLayerApp.dataAccsess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager {
    private IProductDao productDao;
    private ILogger[] loggers;
    public ProductManager(IProductDao productDao, ILogger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice() < 10){
            throw new Exception("Ürün fiyastı 10 dan küçük olamaz.");
        }
        System.out.println("Bu product manager alanı "+product.getName());

        //Interface bağlılığı
        productDao.add(product);

        for ( ILogger logger: loggers
             ) {
            logger.log(product.getName());
        }




    }
}
