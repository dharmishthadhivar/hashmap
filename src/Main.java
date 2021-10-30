import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

main(5);
        mutualFund mf1 = new mutualFund(101, 4);
        mutualFund mf2 = new mutualFund(202, 4);
        insurance ic1 = new insurance(4, 1);
        insurance ic2 = new insurance(4, 2);
        fixediposit fc1 = new fixediposit(4, 301);
        fixediposit fc2 = new fixediposit(4, 302);


        ArrayList<Object> mflist = new ArrayList<>();
        ArrayList<Object> inclist = new ArrayList<>();
        ArrayList<Object> fixedlist = new ArrayList<>();
        mflist.add(mf1);
        mflist.add(mf2);
        inclist.add(ic1);
        inclist.add(ic2);
        fixedlist.add(fc1);
        fixedlist.add(fc2);
        //mflist.add(mf3);

        HashMap<Integer, ArrayList> productMap2 = new HashMap<Integer, ArrayList>();
        productMap2.put(1, mflist);
        productMap2.put(2, inclist);
        productMap2.put(3, fixedlist);


        System.out.println(productMap2);
        main();
    }
    public static void main()
    {
        System.out.println("hi");
    }
    public static void main(int i)
    {
        System.out.println(+i);
    }


}







