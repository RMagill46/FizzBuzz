public class Reduce {

    public static void main(String[] args) {
        System.out.println(Reduce.countSteps(8));
    }

    private static int countSteps(int n){
        int num = 0;
        while(n != 0){
            if (n % 2 == 0){
                n = n / 2;
            }

            else {
                n = n - 1;
            }
            num += 1;
        }
        return num;
    }
}
