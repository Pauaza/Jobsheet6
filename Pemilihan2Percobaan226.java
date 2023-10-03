import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = input26.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = input26.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = input26.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;
        
if (totalSudut == 180) {
    if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
        System.out.println( " segitiga siku-siku");
    else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
    System.out.println("Segitiga sama Sisi");
    else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut3 == sudut2))
    System.out.println(" Segitiga sama kaki");
    else if ((sudut1 != sudut2) || (sudut1 != sudut3) || (sudut2!=sudut3))  
        System.out.println("Segitiga sembarang");
    
} else
    System.out.println("Bukan Segitiga");

       


        
    }
    
}
