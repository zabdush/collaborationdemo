import java.util.Arrays;

public class LeadTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int size = numbers.length;

        for(int i=0; i<size; i++){
            int random = (int)(Math.random()*100);
            numbers[i] = random;
        }

        String before = Arrays.toString(numbers);
        System.out.println("Before: " + before);

        //sort
        Arrays.sort(numbers);

        String after = Arrays.toString(numbers);
        System.out.println("After " + after);

    }

}
