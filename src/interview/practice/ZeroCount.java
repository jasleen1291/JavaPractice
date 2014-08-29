/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jasleen
 */
public class ZeroCount {

    public static int count(int a[], int start, int end) {
        if (start == end) {
            if (a[start] == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        if (a[end] == 0) {
            return 0;
        }
        if (a[start] == 1) {
            return end - start + 1;
        }
        if (a[(start + end) / 2] == 0) {
            return count(a, ((start + end) / 2) + 1, end);
        }
        return count(a, start, ((start + end) / 2)) + count(a, ((start + end) / 2) + 1, end);

    }

    public static int[] partition(int a[])
    {
    
       
        Set A=new TreeSet<>();
        Set B=new TreeSet<>();
        
        return a;
    }
    public static void main(String args[]) {

        System.out.println(count(new int[]{0}, 0, 0));
        System.out.println(count(new int[]{0, 1}, 0, 1));
        System.out.println(count(new int[]{0, 1, 1}, 0, 2));
        System.out.println(count(new int[]{0, 0, 1}, 0, 2));
        System.out.println(count(new int[]{0, 0, 0, 0, 0, 1}, 0, 5));
        System.out.println(count(new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, 0, 9));
        System.out.println(count(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, 0, 12));
    }
}
