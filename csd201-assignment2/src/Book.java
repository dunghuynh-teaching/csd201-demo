/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DUNGHUYNH
 */
public class Book {
    private String code;
    private String name;
    private int lended;
    private int quantity;
    private double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLended() {
        return lended;
    }

    public void setLended(int lended) {
        this.lended = lended;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "code=" + code + ", name=" + name + ", lended=" + lended + ", quantity=" + quantity + ", price=" + price + '}';
    }

    public Book(String code, String name, int lended, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.lended = lended;
        this.quantity = quantity;
        this.price = price;
    }
	
    
    
}
