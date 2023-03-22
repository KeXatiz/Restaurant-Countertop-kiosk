/**
* Class Section: TT3V
* Trimester 2 2021/22
* Muhammad Amir Naqiuddin Bin Salleh | 1191201228 | 013-360 7188
*/
package Restaurant1;

public class Drink implements Menu {

    String[] dname = {"Bandung ","Teh Tarik","Sky Juice"};
    String[] dprice = {"3","2","1"};

    @Override
    public String[] getName() {
        return dname;
    }

    @Override
    public String[] getPrice() {
        return dprice;
    }
    
}
