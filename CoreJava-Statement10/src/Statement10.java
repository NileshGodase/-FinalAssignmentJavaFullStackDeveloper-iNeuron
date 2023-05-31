import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statement10 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(254);
        myList.add(38);
        myList.add(414);
        myList.add(145);
        myList.add(1256);
        myList.add(77);
        myList.add(88);

        int secondLargestEle, secondSmallestEle;

        Collections.sort(myList);

        secondLargestEle = myList.get(myList.size()-2);

        System.out.println(secondLargestEle);

        secondSmallestEle = myList.get(1);

        System.out.println(secondSmallestEle);



    }

}
