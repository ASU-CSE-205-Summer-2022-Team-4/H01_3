//Class: H0_31
//Author: Lia Moua
//ASURITEID: amoua
//email: moua0061@yahoo.com
import java.util.ArrayList;

public class H01_31 {
    //method
    public ArrayList<Integer> arrayListInit(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            list.add(i%5);
        }
        return list;
    }
}
