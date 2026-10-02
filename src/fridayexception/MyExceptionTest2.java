package fridayexception;

class MyException extends Exception {

    MyException(String s) {
        super(s);
    }
}

public class MyExceptionTest2 {

    static void sayHello(String s) throws MyException {
        if (s.equals("John")) {
            throw new MyException("BAD BOY");
        }
        System.out.println("Hello! " + s);
    }

    public static void main(String args[]) {
        try {
            sayHello("John");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
