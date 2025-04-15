public class Main {
    public static void main(String[] args) {

        for(int i=0;i<201;i++) {
            int n = i % 4;
            if (n == 0)
                System.out.println(i);
        }
    }
}