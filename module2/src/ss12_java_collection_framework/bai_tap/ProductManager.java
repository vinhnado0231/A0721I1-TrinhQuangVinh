package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void updateById(int id, String nameEdit, double priceEdit) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.get(i).setName(nameEdit);
                products.get(i).setPrice(priceEdit);
            }
        }
    }

    public void update(Product product, String nameEdit, double priceEdit) {
        product.setName(nameEdit);
        product.setPrice(priceEdit);
    }

    public void delete(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.contains(product)) {
                products.remove(products.get(i));
            }
        }
    }

    public void display() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public boolean seaarch(Product product) {
        return products.contains(product);
    }

    public boolean searchByName(String name) {
        boolean res = false;
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getName()))
                return true;
        }

        return res;
    }

    public void sort() {
//        Collections.sort(products, new CompareProduct());
        Collections.sort(products, Comparator.comparing(Product::getName).thenComparing(Product::getPrice));
    }
}
