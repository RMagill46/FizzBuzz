public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while(i<1000){
            if (i % 3 == 0 || i % 5 == 0){
                count += 1;
            }
            i += 1;
        }
        System.out.println(count);
    }
}
