import java.util.ArrayList;
public class driver {
    public static void main(String[] args){
        //3.1
        H01_31 testing1 = new H01_31();
        //System.out.println(testing1.arrayListInt());

        //3.4
        H01_34 testing2 = new H01_34();
        ArrayList<Integer> list = new ArrayList<>();
        int val = 1;
        while(val < 11){
            list.add(val);
            val++;
        }
        //System.out.println(list);
        //System.out.println(testing2.arrayListSum(list));

        //3.5
        H01_35 testing3 = new H01_35();
        //System.out.println(testing3.arrayListCreate(2, 7));
    }
}
