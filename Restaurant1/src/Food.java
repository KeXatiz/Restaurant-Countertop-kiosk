/**
* Class Section: TT3V
* Trimester 2 2021/22
* Muhammad Amir Naqiuddin Bin Salleh | 1191201228 | 013-360 7188
*/
package Restaurant1;

public class Food implements Menu {
    
    String[] fname = {"Nasi Lemak","Lontong","Laksa"};
    String[] fprice = {"5","6","7"};

    @Override
    public String[] getName() {
        return fname;
    }

    @Override
    public String[] getPrice() {
        return fprice;
    }
    
}
