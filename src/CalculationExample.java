import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try{
            int a = x +y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x+y= " +a);
            System.out.println("Hiệu x-y= " +b);
            System.out.println("tích x*y= " +c);
            System.out.println("Thương x/y= " +d);
        }catch (Exception e){
            System.out.println( " ngoại lệ " + e.getMessage());
    }
    }
}

