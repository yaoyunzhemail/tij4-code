package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的量词
 * X*--贪婪型
 * X*?--勉强项（非贪婪）
 * X*+--占用型（JAVA特有）
 * <p>
 * Created by YaoYunZhe on 2017/4/9.
 */
public class MeasureWord {
    public static void main(String[] args) {

        Matcher m1 = Pattern.compile("ere\\w*").matcher(" thereere is");
        while (m1.find()) {
            System.out.println(m1.group());
        }
        System.out.println("==================");
        Matcher m2 = Pattern.compile("ere\\w*?").matcher(" thereere is");
        while (m2.find()) {
            System.out.println(m2.group());
        }
        System.out.println("==================");
        Matcher m3 = Pattern.compile("ere\\w*+").matcher(" thereere is");
        while (m3.find()) {
            System.out.println(m3.group());
        }
    }

}
