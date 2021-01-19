import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        List<Integer> dataStructure = new ArrayList<>();
        dataStructure.add(0);
        dataStructure.add(1);
        dataStructure.add(2);
        dataStructure.add(3);
        System.out.println(multiplyAll(dataStructure));
    }

    public static long multiplyAll(List<Integer> numberList) {
        long sum = 0;
        long indexCounter = 0;
        int x = 0;
        numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        boolean done = false;

        //TODO: Add implementation

        for (int i = 0; i < numberList.size() - 1; i++) {
            for (int j = i+1; j < numberList.size(); j++) {
                sum += numberList.get(i).longValue() * numberList.get(j).longValue();
            }
        }


        return sum;
    }
    public long multiplySome(List<Integer> numberList) {



        long sum = 0;
        for(int index = 0; index < (numberList.size() / 2); index++) {
            sum = sum + (numberList.get(index) * numberList.get(numberList.size() - index - 1));
        }
        ;
        //TODO: Add implementation

        return sum;
    }
}