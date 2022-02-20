import java.util.Scanner;

public class simpleCal{

public static void main(String[] args){

  int no1, no2, islem;
  
  Scanner input = new Scanner(System.in);

  System.out.print("Birinci Sayıyı Giriniz: ");

  no1 = input.nextInt();

  System.out.println("Birinci Sayınız: " + no1);

  System.out.print("İkinci Sayıyı Giriniz: ");

  no2 = input.nextInt();

  System.out.println("İkinci Sayınız: " + no2);

  System.out.println("*****************************\nHesaplama Yapmak için;\n Toplama için 1\n Çıkarma için 2\n Çarpma için 3\n Bölme için 4\n*****************************");

  System.out.println("Lütfen İşlem Numarasını Giriniz: ");

  islem = input.nextInt();
  
  switch (islem) {
    case 1:
      System.out.println("1- Toplama İşlemi - Sonuc: " + (no1 + no2));
      break;

      case 2:
      System.out.println("2- Çıkarma İşlemi - Sonuc: " + (no1 - no2));
      break;

      case 3:
      System.out.println("3- Çarpma İşlemi - Sonuc: " + (no1 * no2));
      break;

      case 4:
        switch (no2) {
          case 0:
            System.out.println("2.sayı '0' olduğundan bölme işlemi geçersiz sonuç");
            break;
        
          default:
          System.out.println("4- Bölme İşlemi - Sonuc: " + (double)(no1 / no2));
            break;
        }
      break;

    default:
      System.out.println("Geçersiz İşlem Numarası Girdiniz..");
      break;
  }
  

  input.close();

}

}