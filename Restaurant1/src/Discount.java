/**
* Class Section: TT3V
* Trimester 2 2021/22
* Muhammad Amir Naqiuddin Bin Salleh | 1191201228 | 013-360 7188
*/
package Restaurant1;

public class Discount implements Price {

    String[] disname = {"No Coupon","10%","20%"};
    String[] disvalue = {"0","0.1","0.2"};

    @Override
    public String[] getName() {
        return disname;
    }

    @Override
    public String[] getDiscount() {
        return disvalue;
    }
    
}
