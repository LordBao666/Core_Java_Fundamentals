package com.lordbao.concreteCollection;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/5/15 14:50
 * @Version 1.0
 *
 * I rewrote the example in v1ch09/set/SetTest by inputting the filename in
 * the console for better convenience. The part of reading a file can be
 * omitted  since it does not matter here.
 * You should put the file(like alice.txt) into the resources folder since
 * this program will search the file in class path.
 *
 * It should be noted that  the alice.txt I found actually has 3385 unique
 * words instead of  5509 mentioned in the book.
 */
public class TestHashSet {
    public static void main(String[] args) throws URISyntaxException, IOException {
        /* read a file by class path
           Here we use console to get the filename*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your file: ");
        String filename = sc.nextLine();
        URL resource = TestHashSet.class.getResource("/" + filename);
        sc = new Scanner(Path.of(resource.toURI()))  ;

        /* print the number of unique words in the file*/
        HashSet<String> hashSet = new HashSet<>();
        while (sc.hasNext()){
            hashSet.add(sc.next());
        }
        System.out.println(hashSet.size());

    }
}
