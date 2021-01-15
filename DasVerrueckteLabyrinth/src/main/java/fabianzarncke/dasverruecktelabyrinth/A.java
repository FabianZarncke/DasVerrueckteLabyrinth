/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabianzarncke.dasverruecktelabyrinth;

/**
 *
 * @author fabia
 */
public class A {
    
    private B b1;
    private B b2;

    public A(B b1, B b2) {
        this.b1 = b1;
        this.b2 = b2;
    }
    
    public static void main(String[] args) {
        B b1 = new B("Auto1");
        B b2 = new B("Auto2");
        A a = new A(b1, b2);
        
        a.b1.setN("house");
        System.out.println(a.b2.getN());
    }

    public B getB1() {
        return b1;
    }

    public void setB1(B b1) {
        this.b1 = b1;
    }

    public B getB2() {
        return b2;
    }

    public void setB2(B b2) {
        this.b2 = b2;
    }
    
    
    
}
