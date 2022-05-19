//Class: H0_35
//Author: Lia Moua
//ASURITEID: amoua
//email: moua0061@yahoo.com
import java.util.ArrayList;

public class H01_35 {
    //method
    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue){
        ArrayList<Integer> someList = new ArrayList<>();
        for(int i = 0; i < pLen; i++){
            someList.add(pInitValue);
        }
        return someList;
    }
}
