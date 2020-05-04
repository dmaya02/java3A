/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author German
 */
public class Products {
    
        String product_Name;
        int code , quantity;
        float proce;

    public Products(String product_Name, int code, int quantity, float proce) {
        this.product_Name = product_Name;
        this.code = code;
        this.quantity = quantity;
        this.proce = proce;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getProce() {
        return proce;
    }

    public void setProce(float proce) {
        this.proce = proce;
    }
        
    
    
}
