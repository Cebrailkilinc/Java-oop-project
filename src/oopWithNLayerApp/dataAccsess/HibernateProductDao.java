package oopWithNLayerApp.dataAccsess;

import oopWithNLayerApp.entities.Product;

public class HibernateProductDao implements IProductDao{
    public void add(Product product){
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
