package main.java.alan.algorithm.casual;

/**
 * 费波纳茨数列
 *
 * @author alanzhang
 * @since 2017/7/6
 */
public class Fibonacci {




    // public static int index(int value) {
    //
    //
    //
    //
    // }



    public static int value(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("");
        } else if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return value(index - 1) + value(index - 2);
        }
    }


    public static void main(String[] args) {
        System.out.println(value(0));
        System.out.println(value(1));
        System.out.println(value(2));
        System.out.println(value(3));
        System.out.println(value(4));
        System.out.println(value(5));
        System.out.println(value(6));



    }
}
