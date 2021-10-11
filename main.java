import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Masukan Nama, Umur, dan Gaji :");

    // String input
    String name = s.nextLine();

    // Numerical input
    int age = s.nextInt();
    double salary = s.nextDouble();

    // Output input by user
    System.out.println("Nama : " + name);
    System.out.println("Umur : " + age);
    System.out.println("Gaji : " + salary);

    // Math int
    System.out.println("Masukan bilangan yang ingin dijumlahkan :");
    int bil1 = s.nextInt();
    int bil2 = s.nextInt();

    System.out.println("Hasil : " + (bil1 + bil2));

    System.out.println("Masukan bilangan yang ingin dikurangi :");
    int bil5 = s.nextInt();
    int bil6 = s.nextInt();

    System.out.println("Hasil : " + (bil5 - bil6));

    // Double int
    System.out.println("Masukan bilangan desimal yang ingin dijumlahkan :");
    double bil3 = s.nextDouble();
    double bil4 = s.nextDouble();

    System.out.println("Hasil : " + (bil3 + bil4));

    // Question input
    System.out.println("Berapakah 1 + 1 ?");
    int bil7 = s.nextInt();

    System.out.println("Jawaban mu : " + bil7);
    System.out.println("Jawaban benar : 2");

  }
}
