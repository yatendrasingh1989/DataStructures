package com.yaten.poc.java8;

import java.util.ArrayList;

public class DataListProducts {
    public ArrayList<Products> list;
public DataListProducts DataListProducts(){
    list= new ArrayList<Products>();
    list.add(new Products("Beauty Soap", 20));
    list.add(new Products("Wine", 2000));
    list.add(new Products("Car", 200000));
    return new DataListProducts();
}

    public class Products{
        String productName;
        int price;

        @Override
        public String toString() {
            return "Products{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }

        public Products(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }
    }
}
