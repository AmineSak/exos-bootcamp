package org.example;

class PseudoInteger {
    public int value;
    public PseudoInteger(int i) {
        this.value = i;
    }
}

public class Main {

    static boolean process(int i){
        i += 1;
        return i >= 1 ;
    }

    static boolean processClass(Integer i){
        i += 1;
        return i >= 1 ;
    }

    static boolean processClassAlt(PseudoInteger i){
        i.value += 1;
        return i.value == 1;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(process(2));
        System.out.println(processClass(0));

        PseudoInteger n = new PseudoInteger(4);
        System.out.println(processClassAlt(n));


    }

}