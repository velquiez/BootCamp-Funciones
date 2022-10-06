public class Main {
    public static void main(String[] args) {

        int a, b, c;

        suman(a = 15, b = 35, c = 25);

        System.out.println(Main.suman(a,b,c));
    }

    public static String suman(int k, int j, int h) {
        int sum = k + j + h;
        String result = String.valueOf(sum);
        return result;
    }
}