package Glava_13;

public class TestException {
    public static void main(String[] args) {
        String test = "да";
        try {
            System.out.println("начало блока try");
            doRisky(test);
            System.out.println("конец болока try");
        } catch (ScaryException se) {
            System.out.println("проверено исключение SkaryException");
        } finally {
            System.out.println("блок finally");
        }
        System.out.println("конец метода main");
    }
    static void doRisky(String test) throws ScaryException{
        System.out.println("вход в doRisky");
        if ("да".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("выход из doRisky");
    }
}
class ScaryException extends Exception{}
