import java.util.Scanner;
/**
 *
 * @author User 34
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(">>>KALKULATOR<<<");
        
        //Input data
        System.out.print("Berapa?");
        double angka1 = input.nextDouble();
        
        //Menu Operasi
        System.out.println (">>>Pilihan>>>");
        System.out.println("-(1) Ditambah");
        System.out.println("-(2) Dikurangi");
        System.out.println("-(3) Dikali");
        System.out.println("-(4) Dibagi");
        System.out.println("pilih opsi :");
        int menu = input.nextInt();
        
        //Input Data
        System.out.println("Dengan Berapa?");
        double angka2 = input.nextDouble();
        
        //swict case
        switch (menu) {
        case 1:
          System.out.println("Hasil = " + (angka1 + angka2));
          break;
        case 2:
          System.out.println("Hasil = " + (angka1 - angka2));
        case 3:
          System.out.println("Hasil = " + (angka1 * angka2));
        case 4:
          System.out.println("Hasil = " + (angka1 / angka2));
      }
    }
}
