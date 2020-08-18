package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
    // Given an integer k and a list of integers, count the number of distinct valid pairs of integers (a, b) in the list for which a + k = b.
// Two pairs of integers (a, b) and (c, d) are considered distinct if at least one element of (a, b) does not also belong to (c, d).

Example

numbers = [1, 3, 5, 2
p = 1,3
p = a,b
k = 1

// k = 1 (odd)
// (1, 2)
x1 = (numbers[0], numbers[1])
x2 = (numbers[1], numbers[2])
     */
    public static void main( String[] args ) {
        //IntFunction
        Function<String, String> quote = s -> "'" + s + "'";
        quote.andThen().
        quote.andThen()
        LongFunction
        // 1,1,1,2
        //a=1 b =2 stored
        //1+2 = 3
        //2+1 = 3
        // p0 = 1,1 (a,b)
        // p1 = 1,1 (b,a)
        // p2 = 1,2
        // p3 = 1,1
        // p3 = 1,2
        // p4 = 1,1
        // p5 = 5,5
        // p6 = 5,2
        // p7 = 22
        var list = Arrays.asList(1, 1, 1, 2,1);
        process(list, 1);
    }

    private static int counter;
    private static Set<String> store = new HashSet<>();
    /**
     * assumption, my algo is correct perform filter condition a + k = b
     * where p = x1, x2,  k = given
     * @param array
     * @param k
     */
    public static void process(List<Integer> array, int k) {
        if (array.size() == 0) return;
        var a = array.get(0);
        for (var b : array) {
            var key = String.valueOf(a + b);
            if (store.contains(key)) continue;
            store.add(key);
            if (a + k == b) {
                // a = b - k
                //a=1, b=2, 1 + 1 = 2 (true)
                //a=2, b =1, 2 + 1 = 1 (false)
                // 2 = 1-1
                counter++;
                System.out.println("key");
            }


        }
        process(array.subList(1, array.size()), k);

    }
}
