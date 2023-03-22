/**
* Class Section: TT3V
* Trimester 2 2021/22
* Muhammad Amir Naqiuddin Bin Salleh | 1191201228 | 013-360 7188
*/
package Restaurant1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {
    //declaration
    private double price,total,discount,netPay,discountAmount;
    private String[] fname,fprice,dname,dprice,disname,disvalue,bundlename,bundleprice;
    private String discountName;
    
    //create panel & it layout 
    JPanel tengahBig = new JPanel(new GridLayout(2,1));
    JPanel tengahMatrix = new JPanel(new GridLayout(4,4));
    JPanel tengahRow2 = new JPanel();
    JPanel bawahBig = new JPanel();
    JPanel bawahMatrix = new JPanel(new GridLayout(1,2));
    JPanel bawahKiri = new JPanel(new GridLayout(4,1));
    
    //creat label and button for food
    JLabel foodL = new JLabel("Food", SwingConstants.CENTER);                   //make the label on the centre
    JButton f1 = new JButton("<html>Nasi Lemak <br/>RM5</html>");               //to make the word pop on the the next line we use html -> <br/>
    JButton f2 = new JButton("<html>Lontong <br/>RM6</html>");
    JButton f3 = new JButton("<html>Laksa <br/>RM7</html>");
    
    //creat label and button for drink
    JLabel drinkL = new JLabel("Drink", SwingConstants.CENTER);                 //make the label on the centre
    JButton d1 = new JButton("<html>Bandung <br/>RM3</html>");                  //to make the word pop on the the next line we use html -> <br/>
    JButton d2 = new JButton("<html>Teh Tarik <br/>RM2</html>");
    JButton d3 = new JButton("<html>Sky Juice <br/>RM1</html>");
    
    //creat label and button for bundle
    JLabel bundleL = new JLabel("Bundle", SwingConstants.CENTER);               //make the label on the centre
    JButton bund1 = new JButton("<html>Nasi Lemak x2 <br/>RM8</html>");         //to make the word pop on the the next line we use html -> <br/>
    JButton bund2 = new JButton("<html>Teh Tarik x2 <br/>RM3</html>");
    JButton bund3 = new JButton("<html>Nasi Lemak + Bandung <br/>RM6</html>");
    
    //creat label and button for discount
    JLabel disL = new JLabel("Discount", SwingConstants.CENTER);                //make the label on the centre
    JButton dis0 = new JButton("No coupon");
    JButton dis10 = new JButton("Discount 10%");
    JButton dis20 = new JButton("Discount 20%");
    
    JLabel displaytotalPrice = new JLabel("Total Price: RM 0");
    JLabel displayDiscount = new JLabel("Discount: -");
    JLabel displayDiscountAmount= new JLabel("Discount Amount: RM 0");
    JLabel displayPayment = new JLabel("Net Payment: RM 0");
    
    JButton clear = new JButton("Clear");
    
    String [] item = {""};                                                      //set empty so that jlist can pop up on line 54
    JList listItem = new JList(item);                                           
    JScrollPane scrollPane2 = new JScrollPane(listItem);                        //add scroll panel in the panel
    
    //line 62 to 66, for ==> when user click menu (food/drink/bundle) it will add in the Jlist
    DefaultListModel dm = new DefaultListModel();                               //create fx DefaultListModel() and the obj of the fx           
    private void add(String item, String price){                                //fx defination
        listItem.setModel(dm);                                                  //in the JList set model fx DefaultListModel()
        dm.addElement(item+" RM "+price);                                       //add element for the next row
    }
    
   public Frame(){
       //JFrame header
       super("Restoran Amir");
       
       //adjust size(base and height) and show until row 13
       listItem.setVisibleRowCount(13);
       listItem.setFixedCellHeight(18);
       listItem.setFixedCellWidth(457);
       
       //set a big panel center to add menu and list of item
       this.add(tengahBig, BorderLayout.CENTER); 
       //row 1    [add to the gridlayout]
       tengahBig.add(tengahMatrix);
       //row one of the matrix 
       tengahMatrix.add(foodL);
       tengahMatrix.add(drinkL);
       tengahMatrix.add(bundleL);
       tengahMatrix.add(disL);
       
       //row two of the matrix
       tengahMatrix.add(f1);
       tengahMatrix.add(d1);
       tengahMatrix.add(bund1);
       tengahMatrix.add(dis0);
       
       //row three of the matrix
       tengahMatrix.add(f2);
       tengahMatrix.add(d2);
       tengahMatrix.add(bund2);
       tengahMatrix.add(dis10);
       
       //row four of the matrix
       tengahMatrix.add(f3);
       tengahMatrix.add(d3);
       tengahMatrix.add(bund3);
       tengahMatrix.add(dis20);
       
       //row 2          [add to the gridlayout]
       tengahBig.add(tengahRow2);                  
       tengahRow2.add(scrollPane2);       
       
       //set a big panel below to add calcualtion andd clear button
       this.add(bawahBig, BorderLayout.SOUTH);
       bawahBig.add(bawahMatrix);
       bawahMatrix.add(bawahKiri);
       bawahKiri.add(displaytotalPrice);
       bawahKiri.add(displayDiscount);
       bawahKiri.add(displayDiscountAmount);
       bawahKiri.add(displayPayment);
       bawahMatrix.add(clear);
       
       //add listener for every button 
       f1.addActionListener(this);
       f2.addActionListener(this);
       f3.addActionListener(this);
       d1.addActionListener(this);
       d2.addActionListener(this);
       d3.addActionListener(this);
       bund1.addActionListener(this);
       bund2.addActionListener(this);
       bund3.addActionListener(this);
       dis0.addActionListener(this);
       dis10.addActionListener(this);
       dis20.addActionListener(this);
       clear.addActionListener(this);
       
       
       /* Properties of the frame */
       setSize(500, 600);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
    //set the data in this class
    public void setDataFood(String[] fname, String[] fprice) {                  //fx defination
        this.fname = fname;                                                     //use this. mean class have same name as data send 
        this.fprice = fprice;
    }
    public void setDataDrink(String[] dname, String[] dprice) {                 //fx defination
        this.dname = dname;                                                     //use this mean class have same name as data send 
        this.dprice = dprice;
    }
    void setDataDiscount(String[] disname, String[] disvalue) {                 //fx defination
        this.disname = disname;                                                 //use this mean class have same name as data send 
        this.disvalue = disvalue;
    }
    
    void setDataBundle(String[] bundlename, String[] bundleprice) {
        this.bundlename = bundlename;                                           //use this mean class have same name as data send 
        this.bundleprice = bundleprice;
    }
    
    //perform when the button is press or item is press
    @Override
    public void actionPerformed(ActionEvent e) {
        //food actionPerform
        if(e.getSource()== f1){
            price = Double.parseDouble(fprice[0]);                              //change string to double
            total = total + price;                                              
            add(fname[0],fprice[0]);                                            //fx call with parameter; go to line 63
        }else if(e.getSource()== f2){
            price = Double.parseDouble(fprice[1]);                              //change string to double
            total = total + price;
            add(fname[1],fprice[1]);                                            //fx call with parameter; go to line 63
        }else if(e.getSource()== f3){
            price = Double.parseDouble(fprice[2]);                              //change string to double
            total = total + price;
            add(fname[2],fprice[2]);                                            //fx call with parameter; go to line 63
            
        
        //drink actionPerform
        }else if(e.getSource()== d1){
            price = Double.parseDouble(dprice[0]);
            total = total + price;
            add(dname[0],dprice[0]);
        }else if(e.getSource()== d2){
            price = Double.parseDouble(dprice[1]);
            total = total + price;
            add(dname[1],dprice[1]);
        }else if(e.getSource()== d3){
            price = Double.parseDouble(dprice[2]);
            total = total + price;
            add(dname[2],dprice[2]);            
            
        //bundle actionPerform    
        }else if(e.getSource()== bund1){
            price = Double.parseDouble(bundleprice[0]);
            total = total + price;
            add(bundlename[0],bundleprice[0]);
        }else if(e.getSource()== bund2){
            price = Double.parseDouble(bundleprice[1]);
            total = total + price;
            add(bundlename[1],bundleprice[1]);
        }else if(e.getSource()== bund3){
            price = Double.parseDouble(bundleprice[2]);
            total = total + price;
            add(bundlename[2],bundleprice[2]);
            
            
        //discount actionPerfom
        }else if(e.getSource()== dis0){
            discount = Double.parseDouble(disvalue[0]);
            discountName = disname[0];
            displayDiscount.setText("Discount: "+discountName);
        }else if(e.getSource()== dis10){
            discount = Double.parseDouble(disvalue[1]);
            discountName = disname[1];
            displayDiscount.setText("Discount: "+discountName);
        }else if(e.getSource()== dis20){
            discount = Double.parseDouble(disvalue[2]);
            discountName = disname[2];
            displayDiscount.setText("Discount: "+discountName);
             
            
        //clear all the data
        }else if(e.getSource()== clear){                                        
            total = 0;
            displayDiscount.setText("Discount: -");
            netPay = 0;
            
            dm.clear();
        }
        
        
        //overide the Jlabel
        displaytotalPrice.setText("Total Price: RM "+total);
        discountAmount = total * discount;
        displayDiscountAmount.setText(String.format("Discount Amount: RM %.2f",discountAmount)); 
        netPay = total - discountAmount;
        displayPayment.setText(String.format("Net Payment: RM %.2f",netPay));
    }

    

    
    
}
