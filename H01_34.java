import java.util.ArrayList;
public class H01_34 {
    public Integer arrayListSum(ArrayList<Integer> pList){
        int sum = 0;
        if(pList == null) return sum;
        for(int i = 0; i < pList.size(); i++){
            sum += pList.get(i);
        }
        return sum;
    }

}
