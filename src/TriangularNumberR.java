/**
 * TriangularNumberR finds the triangular number using recursion
 */
public class TriangularNumberR {
    public static void main(String[] args) {
        int result = 0;
        TriangularNumberR obj1 = new TriangularNumberR();
        result = obj1.calculateTriNumber(5);
        System.out.println("The final result is: "+result);
    }

    private int calculateTriNumber(int k) {
        int count = 0;
        if (k == 1) {
            return 1;
        } else {
            count = k + calculateTriNumber(k - 1);
        }
        return count;
    }
}
