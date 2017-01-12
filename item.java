/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author Core i3
 */
public class item {
    
    String item_name;
    String cat_name;
    float price;
    
    item(String name, String category, float p){
        
        item_name = name;
        cat_name = category;
        price = p;
        
    }
    
}
