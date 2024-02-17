import java.lang.ref.SoftReference;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача №1 ");
        for (int i = 1; i <= 10; i = i +1) {
            System.out.println(i);
        };

        System.out.println("Задача №2");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.println(a);
        };
        System.out.println( " Задача 3");
        for ( int w = 0; w < 17; w+=2){

            System.out.println("четное число "+ w);
        }
        System.out.println( " Задача №4 ");
        for (int e = 10; e >= -10; e = e - 1){
            System.out.println(e);
        }
        System.out.println( " Задание №5");
        for (int r = 1904; r <= 2096; r = r + 4 ){
            System.out.println(r+ " высокосный год");
        }
        System.out.println(" Задача №6 " );
        for (int t = 7; t <= 98; t = t + 7){
            System.out.println(t);
        }
        System.out.println( " Задача №7 ");
        for (int y = 1; y <= 512; y = y * 2){
            System.out.println(y);
        }
        System.out.println( " Задача №8");
        int saveMoney = 29000;
        double allsum = 0;
        for (int month = 1; month <= 12; month++){
            allsum += saveMoney;
            System.out.println(  " Месяц " + month + " сумма накоплений " + allsum + " рублей");
        }
        System.out.println( " Задача №9");
        allsum = 0;
        double percent =  saveMoney / 100 * (12);
        for (int month = 1; month <=12; month = month + 1){
            allsum += allsum + percent;
            allsum += saveMoney;
            System.out.println( " Месяц " + month + " сумма накоплений равна " + allsum);
        }
        System.out.println(" Задача 10");
        int variable = 2;
        for (int y = 1; y <= 20; y= y+ 1 ){
            System.out.println(variable + " х " + y + " = " + y * variable);
        }













    };

}