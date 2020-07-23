import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by KPS on 7/23/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the index of deleting item");
        int index = scanner.nextInt();
        System.out.println(Arrays.toString(arrays));
        for (int i = index; i< arrays.length-1;i++){
            arrays[i] = arrays[i+1];
        }
        System.out.println(Arrays.toString(arrays));
    }
}
