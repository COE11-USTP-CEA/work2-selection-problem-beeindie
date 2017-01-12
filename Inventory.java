/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Core i3
 */
public class Inventory {

    
    public static void main(String[] args) {
        
        item t1 = new item("Safe Guard", "Soap", 11.00f);
        item t2 = new item("Palmolive", "Shampoo", 9.50f);
        
        List<item> inv = new ArrayList<item>();
        inv.add(t1);
        inv.add(t2);
        
        for(item i:inv){
            
            System.out.println("Item: " + i.item_name);
            System.out.println("Type: " + i.cat_name);
            System.out.println("Price: " + i.price);
            
        }
        
    }
    
}
