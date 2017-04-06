package io;//: io/GZIPcompress.java
// {Args: GZIPcompress.java}

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPcompress {
    public static void main(String[] args)
            throws IOException {
        if (args.length == 0) {
            System.out.println(
                    "Usage: \nGZIPcompress file\n" +
                            "\tUses GZIP compression to compress " +
                            "the file to test.gz");
            System.exit(1);
        }
        BufferedReader in = new BufferedReader(
                new FileReader(args[0]));
        // first way
//        BufferedOutputStream out = new BufferedOutputStream(
//                new GZIPOutputStream(
//                        new FileOutputStream("test.gz")));
//        System.out.println("Writing file");

//        int c;
//        while ((c = in.read()) != -1)
//            out.write(c);
        // first way end

        // second way
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream("test.gz"))));
        System.out.println("Writing file");

        String c;
        while ((c = in.readLine())!=null){
            out.write(c+"\n");
        }
        // second way end

        in.close();
        out.close();
        System.out.println("Reading file");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(new GZIPInputStream(
                        new FileInputStream("test.gz"))));
        String s;
        while ((s = in2.readLine()) != null)
            System.out.println(s);
    }
} /* (Execute to see output) *///:~
