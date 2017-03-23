package io;//: io/MemoryInput.java

import java.io.IOException;
import java.io.StringReader;

import static net.mindview.util.ClassFileUtils.getCurrentPath;


public class MemoryInput {
    public static void main(String[] args)
            throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read(getCurrentPath(MemoryInput.class) + "MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
} /* (Execute to see output) *///:~
