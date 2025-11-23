package com.ncist.class8.PiecewiseFunction;
import java.util.Scanner;
class Function {
    int f()               {  return 0; }
    int f(int x)          { return x*x; }
    int f(int x, int y)   { return x*x + y*y; }
    int f(int x, int y, int z) {  return x*x + y*y + z*z; }
}
public class Main {
    public static void main(String[] args) {
        int x, y, z;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        Function function = new Function();
        int result;

        if (x < 0) {
            result = function.f();          // 无参版本
        } else if (y < 0) {
            result = function.f(x);         // 1 个参数版本
        } else if (z < 0 ) {
            result = function.f(x, y);      // 2 个参数版本
        } else {
            result = function.f(x, y, z);   // 3 个参数版本
        }

        System.out.println(result);
    }
}



