//Class: H0_31
//Author: Lia Moua
//ASURITEID: amoua
//email: moua0061@yahoo.com
import java.util.ArrayList;

public class H01_31 {
    //method
    public ArrayList<Integer> arrayListInt(){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        while(start < 5){
            list.add(start);
            start++;
        }
        while(start < 5){
            list.add(start);
            start++;
        }
        return list;
    }
}
