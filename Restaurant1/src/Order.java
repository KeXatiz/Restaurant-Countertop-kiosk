/**
* Class Section: TT3V
* Trimester 2 2021/22
* Muhammad Amir Naqiuddin Bin Salleh | 1191201228 | 013-360 7188
*/
package Restaurant1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Order {
    private Menu food,drink;
    private Price discount,bundle;
    
    Frame fr = new Frame();
    
    String[] fname,fprice,dname,dprice,disname,disvalue,bundlename,bundleprice;
    
    public Order(){
        //create obj of class
        food = new Food();  
        drink = new Drink();
        discount = new Discount();
        bundle = new Bundle();
        
        //fx call
        setFood(); 
        setDrink(); 
        setDiscount(); 
        setBundle();
        
        //fx call with parameter
        fr.setDataFood(fname,fprice);
        fr.setDataDrink(dname,dprice);
        fr.setDataDiscount(disname,disvalue);
        fr.setDataBundle(bundlename,bundleprice);
    }
    
    //fx definition
    public void setFood(){
        fname = food.getName();                                                 //fx call of obj food of class Food() get getName
        fprice = food.getPrice();                                               //fx call of obj food of class Food() get getPrice
    }
    public void setDrink() {
        dname = drink.getName();
        dprice = drink.getPrice();
    }
    public void setDiscount() {
        disname = discount.getName();
        disvalue = discount.getDiscount();
    }
    public void setBundle() {
        bundlename = bundle.getName();
        bundleprice = bundle.getDiscount();
    }
    
    
    
}

