import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Output : " + findSecondLargest(array));
    }

    private static int findSecondLargest(int[] array) {
        int size = array.length;
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(array[j] > array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 1; i < size; i++){
            int max = array[0];
            if(array[i] < max){
                return array[i];
            }
        }
        return -1;
    }
}