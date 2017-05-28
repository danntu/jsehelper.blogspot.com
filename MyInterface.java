
package javacore;

public interface MyInterface {
    abstract int amax(int a, int b);
    
    int imax(int a, int b);
    
    static int smax(int a,int b){
        if (a>b) return a; else return b;
    }
    
    default int dmax(int a, int b){
        if (a>b) return a; else return b;
    }
    
    public final  static int MAX=100;
}
