package lt.kaunascoding;

import java.util.Scanner;

public class Main {
// sukurti  nauja branch kuriame butu igyvendintas metodas ivesto skaiciaus kelimui kvadratu
    // panaudoti feature branch, sukurti pull request, ir atlikti merge


    public static void main(String[] args) {

        System.out.println("Labas, iveskite skaičiu");
        Scanner sc = new Scanner(System.in);
        int ivestasSkaicius = sc.nextInt();

        System.out.println("Ivestas skaičius: "+ ivestasSkaicius);
    }
}
