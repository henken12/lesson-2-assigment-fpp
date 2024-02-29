public class Prog5 {


        public int[] combine(int[] a, int[] b) {
            int[] combined = new int[a.length + b.length];
            for (int i = 0; i < a.length; i++) {
                combined[i] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                combined[a.length + i] = b[i];
            }
            return combined;
        }
        public static void main(String[] args) {
            Prog5 prog = new Prog5();
            int[] a = {5, 6, -4, 3, 1};
            int[] b = {3, 8, 9, 11};
            int[] result = prog.combine(a, b);
            for (int value : result) {
                System.out.print(value + " ");
            }
        }
    }

