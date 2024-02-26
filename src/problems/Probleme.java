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

    public String stergereLitera(String cuvant){

        StringBuilder rezultat = new StringBuilder();


        int ct = 0;

        for (int i =0 ; i< cuvant.length(); i++){

            char litera = cuvant.charAt(i);

            if (litera!= cuvant.charAt(0)){
                rezultat.append(litera);
            }

        }

        return rezultat.toString();

    }

    public void afisareFaraPrimUltim(String cuvant){

        int ct =0;
        for (int i =0, j = cuvant.length(); i < j; i++, j--){

            while ( ct < j){
                System.out.println(cuvant.charAt(ct));
                ct++;

            }

        }

    }

    public String afisareCelMaiLungSirDinMatrice(String[][] matrice, int n, int m){

        StringBuilder max = new StringBuilder();
        max.append(matrice[0][0]);

        for (int i =0 ;i< n; i++){
            for (int j = 0; j < m;j++){
                if (matrice[i][j].length() > max.length()){
                    max.append(matrice[i][j]);
                }
            }

        }
        return max.toString();
    }



}
