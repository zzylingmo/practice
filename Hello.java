import java.util.Arrays;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello,world!");//文本输出“Hello，world！”

//        换行输出
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

//        格式化输出
        double d = 3.1415926;
        System.out.printf("%.2f\n",d);
        System.out.printf("%.4f\n",d);

//        自增
        int j = 100;
        int m = 100;
        j++;
        ++m;
        System.out.println(j);
        System.out.println(m);



    }
}
