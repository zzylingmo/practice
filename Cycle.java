import java.util.Arrays;

/**
 * @author zzylm
 * @description TODO
 * @date 2024-06-24 14:56
 */
public class Cycle {
    public static void main(String[] args) {
//        if else 判断
        int n = 100;
        if(n > 90){
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        }else {
            System.out.println("挂科了");
        }

//        浮点数差值判断
        double x = 1 - 9.0 / 10;
        if(Math.abs(x - 0.1) < 0.00001){
            System.out.println("x is 0.1");
        }else {
            System.out.println("x is NOT 0.1");
        }

//        判断引用类型相等 —— equals
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            System.out.println("s1 equals s2");
        }else {
            System.out.println("s1 not equals s2");
        }
//        字符串为 null 特例
        s1 = null;
        if(s1 !=null && s1.equals("hello")){
            System.out.println("hello");
        }

//        switch 多重选择: Java 12后语法 ->;Java 14后语法 yield
        String fruit = "orange";
        int opt = switch (fruit){
            case "apple" -> 1;
            case "pear","mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code;
            }
        };
        System.out.println("opt = "+opt);

//        While 循环
        int sum = 0;
        int j = 1;
        while(j <= 100){
            sum = sum + j;
            j ++;
        }
        System.out.println(sum);

//        do while 循环
        j = 1;sum = 0;
        do {
            sum = sum + j;
            j++;
        }while (j <= 100);
        System.out.println(sum);

//        for 循环
        sum = 0;
        for(int i=1;i<=100;i++){
            sum = sum + i;
        }
        System.out.println(sum);

//        for each 遍历数组
        int[] ns = {1,1,2,3,5,8};
        for(int mn : ns){
            System.out.print(mn + ",");
        }
        System.out.println(Arrays.toString(ns));
    }
}
