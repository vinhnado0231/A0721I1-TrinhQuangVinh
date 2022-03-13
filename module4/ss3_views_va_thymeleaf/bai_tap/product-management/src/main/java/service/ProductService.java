package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {

    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Ti vi", 10, 20));
        products.put(2, new Product(2, "Tu lanh", 15, 30));
        products.put(3, new Product(3, "Dieu hoa", 7, 30));
        products.put(4, new Product(4, "May giat", 4, 30));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        for (int i = 1; i <= products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}