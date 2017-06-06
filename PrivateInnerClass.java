/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
class Outer{
    private int a=5;
    class Inner{
        void show(){
            System.out.println("a is private in Outer class "+a);
        }
    }
}
public class PrivateInnerClass {
    public static void main(String args[]){
        Outer ou = new Outer();
        Outer.Inner innerObject=ou.new Inner();
        innerObject.show();
    }
}
