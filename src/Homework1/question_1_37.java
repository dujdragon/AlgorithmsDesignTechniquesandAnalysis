package Homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求多项式 a0 + a1x + a2x^2 + ... + anx^n
 * 使用Ω(n^2)和O(n)
 */
public class question_1_37 {
    private static List<Integer> p = Arrays.asList(10, 1, 2, 3, 4, 5);
    public static void main(String[] args) {
        System.out.println(func1(2));
        System.out.println(func2(2));
    }

    private static int func1(int x) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        list = p;
        for (int i = 1; i < list.size(); i ++ ) {
            for (int j = i; j < list.size(); j ++ ) {
                list.set(j, list.get(j) * x);
            }
        }
        for (int e : list) {
            res += e;
        }
        return res;
    }

    private static int func2(int x) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        list = p;
        int s = 1;
        for (int e : list) {
            res += e * s;
            s *= x;
        }
        return res;
    }
}

