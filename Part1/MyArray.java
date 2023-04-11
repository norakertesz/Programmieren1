package Part1;

public class MyArray {

    public static void main(String[] args) {
        double[][] zahlen = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0, 0.56}};

        for (double number : zahlen[1]) {
            System.out.print(number + " ");
        }


    }
}
