public class Sum {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            System.out.println(i + " = " + sum);
        }
    }
}
