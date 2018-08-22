package showcase.codegym.service;

import showcase.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "iPhoneX", "iPhone", 16000000));
        productMap.put(2, new Product(2, "OppoF1S", "Oppo", 6000000));
        productMap.put(3, new Product(3, "Note9", "SamSung", 26000000));
        productMap.put(4, new Product(4, "iPadAir", "iPad", 16000000));
        productMap.put(5, new Product(5, "iMac", "Mac", 16000000));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }
}
