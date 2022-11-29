import com.bentuk.*;
import com.hitung.*;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p,l;
        System.out.print("masukan panjang: ");
        p = sc.nextInt();
        System.out.print("masukan lebar: ");
        l = sc.nextInt();

        Lingkaran lingsatu = new Lingkaran(y);
        Persegi persegisatu = new Persegi(x,y);

        HitungArsir pertama = new HitungArsir(lingsatu, persegisatu);
        pertama.tampilkanHasil();
        
        sc.close();
    }
}
