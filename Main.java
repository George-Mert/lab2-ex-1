import java.util.*;

class CarlysMotto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduceti numarul de clienti");
        int nrClienti = sc.nextInt();
        int pret = 35;
        int pretTotal = pret * nrClienti;
        System.out.println("pretul total este:" + pretTotal);
        System.out.println(
                "***********************************************\n" +
                        "*Carly’s makes the food that makes it a party.*\n" +
                        "***********************************************\n");
    }
}