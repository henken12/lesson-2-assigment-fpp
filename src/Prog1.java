import java.util.Random;

public class Prog1 {

        public static void main(String[] args) {
            Random random=new Random();
            int x= random.nextInt(9)+1;
            double result1=Math.PI*x;
            int y= random.nextInt(14)+3;
            double result2=Math.PI*y;
            System.out.println(result1);
            System.out.println(result2);
        }
    }

