package ss17_io_binary_file_and_serailization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {
    private static final String path = "ss17_io_binary_file_and_serailization/bai_tap/data.bin";
    private List<Product> data = new ArrayList<>();

    ProductService() {
        data = getAll();
    }

    void add(Product product) throws IOException {
        List<Product> products = getAll();
        product.setId(products.size() + 1);
        products.add(product);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(products);
    }

    List<Product> getAll() {
        try {
            File file = new File(path);
            if (!file.exists())
                file.createNewFile();

            if (file.length() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
                data = (ArrayList) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    List<Product> searchByName(String name) {
        List<Product> res = new ArrayList<>();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            if ((data.get(i).getName().contains(name)))
                res.add(data.get(i));
        }

        return res;
    }

    List<Product> searchFromPrice(double price) {
        return data.stream().filter(e -> e.getPrice() > price).collect(Collectors.toList());
    }

    int deleteByName(String name) {
        int res = 0;
        Optional<Product> product = data.stream().filter(e -> name.equals(e.getName())).findFirst();
        if (product.isPresent()) {
            data.remove(product.get());
            res = product.get().getId();
        }
        return res;
    }

    void update(Product product) throws IOException {
        int index = data.indexOf(product);
        data.set(index, product);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(data);
    }

    List<Product> sortByPrice() {
        Collections.sort(data);
        return data;
    }
}
