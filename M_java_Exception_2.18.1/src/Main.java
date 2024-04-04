import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] numbers_n = new int[3];
        numbers_n[0] = 100;
        System.out.println(Arrays.toString(numbers_n));

        // 2
        try{
            int[] numbers = new int[3];
            numbers[4]=45;
            System.out.println(numbers[4]);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            System.out.println("Блок finally");
        }
        System.out.println("Программа завершена");
        System.out.println();


        // 3
        int[] numbers_3 = new int[3];
        try{
            numbers_3[6]=45;
            numbers_3[6]=Integer.parseInt("gfd");
        }
        catch(ArrayIndexOutOfBoundsException ex_3){
            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex_3){
            System.out.println("Ошибка преобразования из строки в число");
        }
        System.out.println();


        // 4
        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex_4){
            System.out.println(ex_4.getMessage());
        }
        System.out.println("Программа завершена");
    }
}