package Morfar;

public class guessNumber {
    public static void main(String[] args) {
        int [] yo = {1,2,3,4,5};
        Search(yo,5);

    }

    public static void Search (int [] array, int value) {
        int index_of_value = -1;
        int i = 0;
        while ((i < array.length) && (index_of_value < 0)) {
            if(array[i] == value) {
                index_of_value = i;
            }
            i++;
        }
    }
}
