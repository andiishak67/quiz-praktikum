import java.util.Scanner;

public class program_toko {
public static void main (String[] args){
Scanner input = new Scanner (System.in);
String nama;
int merek, tipe, jumlah, bayar;
System.out.print("masukkan nama anda\t\t:");
nama = input.nextLine();
System.out.print("Pilih Merek Yg Inginkan\t:");
merek = input.nextInt();
System.out.print("Pilih Tipe Yg Diinginkan\t:");
tipe = input.nextInt();
System.out.print("Jumlah Yg Ingin Dibeli\t:");
jumlah = input.nextInt();
System.out.print("Masukkan pembayaran\t:");
bayar = input.nextInt();
int total, kembalian;
total = merek + tipe;
jumlah = total * jumlah;
kembalian = bayar - total;
System.out.println("===================toko furniture===================");  
        System.out.println("Nama\t\t\t:" + nama);    
        System.out.println("Total harga\t\t:Rp " + total + ",-");  
        System.out.println("Total bayar\t\t:Rp " + bayar + ",-");  
        System.out.println("kembalian\t\t:Rp " + kembalian + ",-");
        System.out.println("==============================================");
}
}
