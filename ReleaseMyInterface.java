
package javacore;

/**
 *
 * @author DMyrzaka
 */
public class ReleaseMyInterface implements MyInterface{
    public static void main(String[] args) {
        MyInterface.smax(2, 5);
        System.out.println("MyInterface.smax(2, 5) = "+MyInterface.smax(2, 5));
        ReleaseMyInterface ri = new ReleaseMyInterface();
        System.out.println("ri.dmax(10, 5) = "+ri.dmax(10, 5));
    }
    public int imax(int a, int b){
       if (a>b) return a; else return b;
    }
    
    @Override
    public int amax(int a, int b) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (a>b) return a; else return b;
    }
}
