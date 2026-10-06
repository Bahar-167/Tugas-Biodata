public class Main {
  public static void main(String[] args) {
    double a = 10;
    double b = 5;
    String op = "+";
    
    System.out.println("Angka 1 = " + a);
    System.out.println("Angka 2 = " + b);
    System.out.println("Operator = " + op);

    switch (op) {
      case "+":
        System.out.println("Hasil = " + (a + b));
        break;
      case "-":
        System.out.println("Hasil = " + (a - b));
        break;
      case "*":
        System.out.println("Hasil = " + (a * b));
        break;
      case "/":
        if (b == 0) {
          System.out.println("Tidak bisa dibagi 0!");
        } else {
          System.out.println("Hasil = " + (a / b));
        }
        break;
      default:
        System.out.println("Operator salah!");
    }
  }
    }
