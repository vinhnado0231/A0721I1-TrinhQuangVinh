package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Toyota Corolla Cross", 3346, 720, "Xe Toyota Corolla Cross "));
        products.put(2, new Product(2, "Toyota Vios", 2297, 600, "Xe Toyota Vios"));
        products.put(3, new Product(3, "VinFast Fadil", 2489, 450, "Xe VinFast Fadil"));
        products.put(4, new Product(4, "Ford Ranger", 2120, 1200, "Xe Ford Ranger"));
        products.put(5, new Product(5, "KIA Seltos", 1957, 634, "Xe KIA Seltos"));
        products.put(6, new Product(6, "Mitsubishi Xpander", 1566, 555, "Xe Mitsubishi Xpander"));
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
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findByName(String name) {
        List<Product> products = findAll();
        for (Product value : products) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }
}
