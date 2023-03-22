/**
* Class Section: TT3V
* Trimester 2 2021/22
* Muhammad Amir Naqiuddin Bin Salleh | 1191201228 | 013-360 7188
*/
package Restaurant1;

public class Bundle implements Price {

    String[] bundlename = {"Nasi Lemak x2 (B)","Teh Tarik x2 (B)","Nasi Lemak + Bandung (B)"};
    String[] bundleprice = {"8","3","6"};

    @Override
    public String[] getName() {
        return bundlename;
    }

    @Override
    public String[] getDiscount() {
        return bundleprice;
    }
    
}
