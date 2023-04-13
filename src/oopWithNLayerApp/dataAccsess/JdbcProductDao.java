package oopWithNLayerApp.dataAccsess;

import oopWithNLayerApp.entities.Product;

public class JdbcProductDao implements IProductDao{
    public  void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
