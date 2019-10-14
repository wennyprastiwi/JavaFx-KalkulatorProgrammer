// program berakhir di sini, dalam program ini kita mengambil input dari pengguna 
//dan memanfaatkan loop while logis yang mengambil 
// modulus dari angka yang diberikan,dan memberikan nilai hasil ke pernyataan berikutnya dalam loop. 
//jadi dengan ini, kita bisa menghitung angka biner dari angka desimal yang diberikan

package kalkulatorprogrammer;

import java.util.Scanner;
public class KalkulatorProgrammer
{
public static void main(String[] args)
{
int n, a;
String x = "";
Scanner s = new Scanner(System.in);
System.out.print("Enter any decimal number:");
n = s.nextInt();
while(n > 0)
{
a = n % 2;
x = a + "" + x;
n = n / 2;
}
System.out.println("Binary number:"+x);
  
}
}
