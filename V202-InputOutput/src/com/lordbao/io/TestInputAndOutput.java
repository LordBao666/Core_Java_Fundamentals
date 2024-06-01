package com.lordbao.io;

import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @Author Lord_Bao
 * @Date 2024/5/31 18:17
 * @Version 1.0
 *
 *
 * In java.io, the relative path is based on the starting point of
 * the current working directory,which you can find out by calling
 * System.getProperty("user.dir")
 */
public class TestInputAndOutput {
    @Test
    public void testInputStreamAndOutputStream() throws IOException {
        File inputFile = new File("resources/hello.txt");
        File outputFile = new File("resources/hello1.txt");

        //how to copy a file in java 9 by FileInputStream and FileOutputStream
//        try(FileInputStream fis = new FileInputStream(inputFile);
//            FileOutputStream fos = new FileOutputStream(outputFile);
//            ){
//            //Java 9 feature: transfer an inputStream to an outputStream
//            //the effect here is creating a new file called hello1.txt
//            fis.transferTo(fos);
//        }

        //how to copy a file in java 8 by FileInputStream and FileOutputStream
        try(FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
        ){
            final   int packetLen = 16;
            byte [] bufferArr = new byte[packetLen];
            int readLen=0;
            while ((readLen = fis.read(bufferArr))==packetLen){
                //write the bytes  in a unit of packetLen
                fos.write(bufferArr);
            }
            //write the remaining bytes
            for(int i=0;i<readLen;i++){
                fos.write(bufferArr[i]);
            }

        }

    }

    @Test
    public void testReadAndWriteText() throws IOException {
      //Whenever println(not the print like) is called,the data will flush if autoFlush is true
        try(
            PrintWriter writer = new PrintWriter(new FileOutputStream("resources/hello2.txt"),true);
            ){

            for(int i=1;i<=20;i++){
                writer.print(i);
                writer.print(",");
                if(i%5==0){
                    writer.println();
                }
            }
            writer.flush();//You still need to flush manually when non-println methods are called
        }



        //When dealing with a short text, try Files.readString
        String str = Files.readString(Path.of("resources/hello2.txt"));
        System.out.println(str);

        //If you want read by line, try  Files.readAllLines
        List<String> list = Files.readAllLines(Path.of("resources/hello2.txt"));
        System.out.println(list);

        //When dealing with a long text, try Files.lines
        Stream<String> stream = Files.lines(Path.of("resources/hello2.txt"));
        stream.forEach(System.out::println);


        //the default delimiter of Scanner is whitespace character,however you can modify it by useDelimiter
        Scanner reader = new Scanner(Path.of("resources/hello2.txt"));
        reader.useDelimiter(",");
        while (reader.hasNext()){
            System.out.print(reader.next()+" ");
        }
        System.out.println();

        //Returns a stream of delimiter-separated tokens from this scanner.
        //Again,the default delimiter is whitespace character
        reader =new Scanner(Path.of("resources/hello2.txt"));
        Stream<String> tokens = reader.useDelimiter(",").tokens();
        tokens.forEach(ele-> System.out.println(ele+" "));
    }
}
