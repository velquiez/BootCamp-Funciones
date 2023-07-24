public class Main {
    public static void main(String[] args) {

        //Factorials(8);
        System.out.println(Factorials(7));

        suma(2, 3);

    }

    public static int Factorials(int num ){
        int result = 0;

        if (num == 1){
            return 1;
        }

        result = Factorials(num-1)* num;
        return result;

    }

    public static void suma (int a, int b){
        int temp =  a + b;

        System.out.println("A vale: "+ a + " B vale: " + b  + " Temporal vale: "+ temp );

        if (temp >= 90){
            return;
        }

        suma(a,temp);
    }

}