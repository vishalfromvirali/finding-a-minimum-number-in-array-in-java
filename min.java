import java.util.*;
class array{
    public static void main(String[]args){
        int[] numbers = {5, 2, 8, 1, 9};
        int min = numbers[2];
        int max = numbers[2];

    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
        if (numbers[i] > max) {
            max = numbers[i];
        }
}

System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
        
}
}