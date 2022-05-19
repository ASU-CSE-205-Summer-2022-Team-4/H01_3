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
