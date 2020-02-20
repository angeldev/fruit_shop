/**
 * Copyright (c) 2020 Asaitec
 */
package com.asaitec.challenge.client;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.asaitec.challenge.model.Product;
import com.asaitec.challenge.util.Utils;

/**
 * The <code>ProductsClient</code> class is a fake client that consumes a fake Product 
 * service.
 * 
 * @author  Angel David Macho
 */
public class ProductsClient {

    private final String filePath = "src/com/asaitec/challenge/res/products";
            
    /** File where products are stored */
    private final File file = new File(filePath);
    
    /** Products available in the supermarket */
    private Map<String, Product> products;
    
    
    public ProductsClient() {
        super();
        this.products = getAllProducts();
    }
    
    /**
     * Get product given an id
     * @param   id      id of the product to retrieve    
     * @return  Product 
     */
    public Product getProductById(String id) {
        return products.get(id);
    }

    /**
     * Fill supermarket with available products
     * @return Map  map of products
     */
    private Map<String, Product> getAllProducts() {
        Map<String, Product> products = new HashMap<>();
        
        List<String> lines = Utils.getLines(file);
        for (String line : lines) {
            Product product = new Product(line);
            products.put(product.getId(), product);
        }
        return products;
    }
    
    public Map<String, Product> getProducts() {
        return products;
    }
    
}
