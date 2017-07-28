import org.jetbrains.annotations.Contract;

abstract class AbstractWithAbstractMethod{
    abstract int calculate1();
    @Contract(pure = true)
    static int plus(int a, int b){
        return a+b;
    }
    int plus(int a){
        return a;
    }
}
//abstract
class AbstractWithoutAbstractMethod extends AbstractWithAbstractMethod{
   


    public int calculate1(){
        return 10*10;
    }
    @Contract(pure = true)
    static int max(){
        int t=0;
        return t;
    }
    void showinnerclass(){
        Test  t =new Test();
        t.testinnerclass();
    }
    class Test{
        public void testinnerclass(){
            System.out.println("Test inner class");
        }
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        AbstractWithoutAbstractMethod.max();
        AbstractWithoutAbstractMethod test = new AbstractWithoutAbstractMethod();
        test.showinnerclass();
    }
}
