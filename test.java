import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int x = 3949102;
        char[] numbers = String.valueOf(x).toCharArray();
        Arrays.sort(numbers);
        System.out.println(numbers);
    }
}
