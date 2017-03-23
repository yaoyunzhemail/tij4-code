package net.mindview.util;

import java.io.File;
import java.io.IOException;

/**
 * Created by YaoYunZhe on 2017/3/16.
 */
public class ClassFileUtils {
    public static String getCurrentPath() {
        return getCurrentPath(ClassFileUtils.class);
    }

    public static String getCurrentPath(Class classType) {
        return classType.getResource("").getPath().replace("/build/classes/main", "/src/main/java");
    }


    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        System.out.println("==========================================");
        System.out.println(ClassFileUtils.class.getResource("").getPath());
        System.out.println("==========================================");
        System.out.println(ClassFileUtils.class.getResource("/").getPath());

        System.out.println("==========================================");
        File directory = new File("");//设定为当前文件夹
        System.out.println(directory.getCanonicalPath());//获取标准的路径
        System.out.println(directory.getAbsolutePath());//获取绝对路径

        System.out.println("==========================================");
        File directory2 = new File(".");//设定为当前文件夹
        System.out.println(directory2.getCanonicalPath());//获取标准的路径
        System.out.println(directory2.getAbsolutePath());//获取绝对路径

        System.out.println("==========================================");
        File directory3 = new File("..");//设定为当前文件夹
        System.out.println(directory3.getCanonicalPath());//获取标准的路径
        System.out.println(directory3.getAbsolutePath());//获取绝对路径
    }
}
