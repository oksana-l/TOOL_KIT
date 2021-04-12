public class PrintArray { 

    public static void printArray(double[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }
}