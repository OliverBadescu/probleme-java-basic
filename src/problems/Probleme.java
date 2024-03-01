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

    public void modificareCuvant(String cuvant){

        for (int i =0; i< cuvant.length(); i++){
            if (Character.isLowerCase(cuvant.charAt(i))){
                Character.toUpperCase(cuvant.charAt(i));
            }else{
                Character.toLowerCase(cuvant.charAt(i));
            }
        }

    }

    public void sortareDescrescatoare(String []sir){

        boolean sortat = false;

        do{
            sortat = true;

            for (int i = 0; i < sir.length - 1; i++) {

                if (sir[i].length() < sir[i+1].length()) {
                    String aux = sir[i];
                    sir[i] = sir[i+1];
                    sir[i+1] = aux;

                    sortat = false;
                }

            }

        } while (!sortat);
    }

    public void afisareLiniiNoi(String text){

        String punct = "[.]";

        String[]propozitii = text.split(punct);

        for (int i =0; i< propozitii.length; i++){
            System.out.println(propozitii[i].trim());

        }

    }

    public boolean isRimeaza(String cuv1, String cuv2){

        boolean ok = false;

        if (cuv1.charAt(cuv1.length()-2) == cuv2.charAt(cuv2.length()-2) && cuv1.charAt(cuv1.length()-1) == cuv2.charAt(cuv2.length()-1)) {
            ok = true;
        }

        return ok;

    }

    public String sirNumere(String text){

        StringBuilder nou = new StringBuilder();

        for(int i =0; i < text.length()-1; i++){
            if(Character.isDigit(text.charAt(i))){
                nou.append(text.charAt(i));
            }
            if(text.charAt(i+1) == ' '){
                nou.append(" ");
            }

        }
        return nou.toString();
    }

    public int sumaValPare(int[][] matrice, int n, int m){

        int s = 0;

        for (int i =0 ; i < n;i++){
            for (int j =0; j< m;j++ ){
                if (matrice[i][j] % 2 == 0){
                    s += matrice[i][j];
                }

            }
        }
        return s;
    }

    public boolean isPrim(int nr){

        int ct = 0;

        for (int i =1; i<= nr ;i++){
            if ( nr % i == 0){
                ct++;
            }
        }
        if ( ct == 2){
            return true;
        }
        return false;

    }

    public int contorPrimePeIndiciPare( int[][] matrice, int n , int m){

        int ct = 0;

        for (int i =0 ; i <n;i++){
            for (int j =0; j< m; j++){
                if ( i % 2 ==0 && isPrim(matrice[i][j])){
                    ct++;
                }
            }
        }
        return ct;
    }

    public int calculSumaLinie(int[] linie) {
        int suma = 0;
        for (int element : linie) {
            suma += element;
        }
        return suma;
    }
    public void sortareMatriceDupaSuma(int[][] matrice) {


        for (int i = 0; i < matrice.length - 1; i++) {
            for (int j = 0; j < matrice.length - i - 1; j++) {
                int sumaLinieJ = calculSumaLinie(matrice[j]);
                int sumaLinieJPlus1 = calculSumaLinie(matrice[j + 1]);


                if (sumaLinieJ > sumaLinieJPlus1) {
                    int[] temp = matrice[j];
                    matrice[j] = matrice[j + 1];
                    matrice[j + 1] = temp;
                }
            }
        }
    }

    public void afisare(int [][] matrice){

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }

}


