package fridayexception;

public class FinallyTest {

    public static void main(String args[]) {
        for (int i = -2; i <= 2; i++) {
            try {
                System.out.println(10 / i);
            } catch (Exception e) {
                System.out.println("Catch block : " + e);
//                break;
//            } finally {
//                System.out.println("Finally Block");
            }
            System.out.println("End For");
        }
        System.out.println("End Program");
    }

}
