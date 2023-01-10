import java.util.Scanner;
public class kitle {
    public static void main(String[] args) {
        int kilo;
        double index, boy;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = inp.nextInt();
        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz : ");
        boy = inp.nextDouble();
        index = kilo / (boy*boy) ;
        System.out.println("Vücut Kitle İndexsiniz" + index);
    }
}
