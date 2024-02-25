package problems;

public class Probleme {

    public int sumaCifre(int n) {
        int suma = 0;
        while (n != 0) {

            suma += n % 10;
            n = n / 10;
        }
        return suma;
    }

    public int contorLitera(String text, char litera) {


        int ct = 0;

        for (int i = 0; i < text.length(); i++) {
            if (litera == text.charAt(i)) {

                ct++;
            }
        }

        return ct;
    }

    public boolean isVocala(char litera) {
        return "aeiouAEIOU".contains(litera + "");
    }

    public int contorVocale(String text) {

        int ct = 0;
        for (int i = 0; i < text.length(); i++) {

            if (isVocala(text.charAt(i))) {

                ct++;
            }
        }
        return ct;

    }

    public int contorAparitieSilabe(String text, String silabe) {

        int pozitie = text.indexOf(silabe);
        int ct = -1;

        while (pozitie > 0) {

            pozitie = text.indexOf(silabe, pozitie);
            ct++;
            pozitie++;

        }

        return ct;

    }




}
