package fridayexception;

public class ThrowTest {

    static int div(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException();
        }
        return x / y;
    }

    public static void main(String args[]) {
        try {
            System.out.println(div(2500, 50));
        } catch (ArithmeticException e) {
            System.out.println("Error --> Divide by Zero !");
        }
    }

}
