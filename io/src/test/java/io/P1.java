package io;

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by YaoYunZhe on 2017/3/30.
 */
public class P1 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}

class DirFilter implements FilenameFilter {
    private String str;

    public DirFilter(String str) {
        this.str = str;
    }

    public boolean accept(File dir, String name) {
        File currentFile = new File(dir.getAbsoluteFile(), name);
        if (!currentFile.canRead()) {
            return false;
        }

        if (!currentFile.getName().endsWith("txt") && !currentFile.getName().endsWith("out")) {
            return false;
        }
        String content = TextFile.read(currentFile.getAbsolutePath());
        return content != null && content.contains(str) ? true : false;
    }
}
