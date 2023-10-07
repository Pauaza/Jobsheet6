import java.util.Scanner;
public class Pemilihan2Percobaan326 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

    System.out.print("Masukkan kategori : ");
    kategori = input26.nextLine();
    System.out.println("Masukkan besarnya penghasilan : ");
    penghasilan = input26.nextInt();
    
    if (kategori.equalsIgnoreCase("Pekerja")){
        if (penghasilan <= 2000000)
         pajak = 0.01;
        else if (penghasilan <= 3000000)
         pajak = 0.15;
        else
        pajak = 0.02;
    gajiBersih = (int) (penghasilan - (pajak * penghasilan));
    System.out.print("Penghasil Bersih : " + gajiBersih);
    } else if (kategori.equalsIgnoreCase( "pebisnis")) {
        if (penghasilan <= 2500000)
            pajak = 0.2;
        else
            pajak = 0.25;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasil Bersih : " + gajiBersih);
       
    } else
        System.out.println("Masukkan Kategori Salah ");
    }
    
}
