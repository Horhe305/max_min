import java.util.Scanner;
public class Main {
public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj piewrsza liczbe :");
int liczba1 = scanner.nextInt();
System.out.println("Podaj druga liczbe :");
int liczba2  = scanner.nextInt();
System.out.println("Podaj trzecie liczbe :");
int liczba3  = scanner.nextInt();
if(liczba1 > liczba2 && liczba1 >liczba3){
  System.out.println("Najwieksza  liczba to :"+liczba1);
}
if(liczba3 > liczba1 && liczba3 >liczba2){
  System.out.println("Najwieksza liczba to :"+liczba3);
}
if(liczba2 > liczba1 && liczba2 >liczba3){
  System.out.println("Najwieksza  liczba to :"+liczba2);
}
if(liczba1 < liczba2 && liczba1 <liczba3){
  System.out.println("Najmniejsza liczba to :"+liczba1);
}
if(liczba3 < liczba1 && liczba3 <liczba2){
  System.out.println("Najmniejsza liczba to :"+liczba3);
}
if(liczba2 < liczba1 && liczba2 <liczba3){
  System.out.println("Najmniejsza liczba to :"+liczba2);
}
}
}