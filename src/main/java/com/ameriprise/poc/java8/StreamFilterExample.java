package com.ameriprise.poc.java8;
import java.util.stream.Stream;
import java.util.ArrayList;
public class StreamFilterExample {

    public static void main(String[] args){
        DataListProducts productList= new DataListProducts();
        ArrayList<DataListProducts.Products> list=productList.list;
        Stream<DataListProducts.Products> productWithPrice=list.stream().filter(product->product.price>2000);
        productWithPrice.forEach(product->System.out.print(product.toString()));
    }
}
