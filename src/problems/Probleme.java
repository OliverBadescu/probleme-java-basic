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

    public String stergereLitera(String cuvant) {

        StringBuilder rezultat = new StringBuilder();


        int ct = 0;

        for (int i = 0; i < cuvant.length(); i++) {

            char litera = cuvant.charAt(i);

            if (litera != cuvant.charAt(0)) {
                rezultat.append(litera);
            }

        }

        return rezultat.toString();

    }

    public String afisareCelMaiLungSirDinMatrice(String[][] matrice, int n, int m) {

        StringBuilder max = new StringBuilder();
        max.append(matrice[0][0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrice[i][j].length() > max.length()) {
                    max.append(matrice[i][j]);
                }
            }

        }
        return max.toString();
    }

    public void modificareCuvant(String cuvant) {

        for (int i = 0; i < cuvant.length(); i++) {
            if (Character.isLowerCase(cuvant.charAt(i))) {
                Character.toUpperCase(cuvant.charAt(i));
            } else {
                Character.toLowerCase(cuvant.charAt(i));
            }
        }

    }

    public void sortareDescrescatoare(String[] sir) {

        boolean sortat = false;

        do {
            sortat = true;

            for (int i = 0; i < sir.length - 1; i++) {

                if (sir[i].length() < sir[i + 1].length()) {
                    String aux = sir[i];
                    sir[i] = sir[i + 1];
                    sir[i + 1] = aux;

                    sortat = false;
                }

            }

        } while (!sortat);
    }

    public void afisareLiniiNoi(String text) {

        String punct = "[.]";

        String[] propozitii = text.split(punct);

        for (int i = 0; i < propozitii.length; i++) {
            System.out.println(propozitii[i].trim());

        }

    }

    public boolean isRimeaza(String cuv1, String cuv2) {

        boolean ok = false;

        if (cuv1.charAt(cuv1.length() - 2) == cuv2.charAt(cuv2.length() - 2) && cuv1.charAt(cuv1.length() - 1) == cuv2.charAt(cuv2.length() - 1)) {
            ok = true;
        }

        return ok;

    }

    public String sirNumere(String text) {

        StringBuilder nou = new StringBuilder();

        for (int i = 0; i < text.length() - 1; i++) {
            if (Character.isDigit(text.charAt(i))) {
                nou.append(text.charAt(i));
            }
            if (text.charAt(i + 1) == ' ') {
                nou.append(" ");
            }

        }
        return nou.toString();
    }

    public int sumaValPare(int[][] matrice, int n, int m) {

        int s = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrice[i][j] % 2 == 0) {
                    s += matrice[i][j];
                }

            }
        }
        return s;
    }

    public boolean isPrim(int nr) {

        int ct = 0;

        for (int i = 1; i <= nr; i++) {
            if (nr % i == 0) {
                ct++;
            }
        }
        if (ct == 2) {
            return true;
        }
        return false;

    }

    public int contorPrimePeIndiciPare(int[][] matrice, int n, int m) {

        int ct = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0 && isPrim(matrice[i][j])) {
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

    public void afisare(int[][] matrice) {

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }


    public int minMatrice(int[][] matrice) {

        int min = 99;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] < min) {
                    min = matrice[i][j];
                }
            }
        }
        return min;
    }

    public int pozElemMin(int[][] matrice) {

        int min = minMatrice(matrice);
        int imin = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == min) {
                    return j;
                }
            }
        }
        return -1;
    }

    public void inlocuireElementeMin(int[][] matrice) {

        int min = minMatrice(matrice);
        int imin = pozElemMin(matrice);

        for (int j = 0; j < matrice[0].length; j++) {
            for (int i = 0; i < matrice.length; i++) {
                if (j == imin) {
                    matrice[i][j] = min;
                }

            }

        }

    }

    public void afisarePrimUltim(String text) {

        for (int i = 0, j = text.length(); i < j; i++, j--) {

            System.out.println(text.substring(i, j));
        }

    }

    public String modificareCuvantMicMare(String cuvant) {
        String text = "";
        for (int i = 0; i < cuvant.length(); i++) {
            text += Character.isUpperCase(cuvant.charAt(i)) ? Character.toLowerCase(cuvant.charAt(i)) : Character.toUpperCase(cuvant.charAt(i));
        }
        return text;
    }

    public Boolean isFata(String nume) {
        return nume.charAt(nume.length() - 1) == 'a' || nume.equals("Carmen") || nume.equals("Alice");
    }

    public int contorNumarFete(String[] lista) {

        int ct = 0;
        for (int i = 0; i < lista.length; i++) {
            if (isFata(lista[i])) {
                ct++;
            }
        }
        return ct;
    }

    public String inserare(String cuvant, char c, int poz) {

        return cuvant.substring(0, poz) + c + cuvant.substring(poz);

    }

    public String inserareCuv(String text, String cuvant, int poz) {

        return text.substring(0, poz) + cuvant + text.substring(poz);

    }

    public String createWord(char c, int counter) {

        String text = "";

        for (int i = 0; i < counter; i++) {

            text += c;
        }

        return text;
    }

    public String decodificare(String text) {

        String txt = "";

        for (int i = 0; i < text.length(); i++) {

            if (Character.isDigit(text.charAt(i))) {
                String cuv = createWord(text.charAt(i + 1), 4);
                txt += cuv;

            }

        }
        return txt;
    }

    public String Fnume(String s) {

        String id = "";
        for (int i = 0; i < s.length(); i++) {
            id += s.charAt(i);

            if (s.charAt(i) == ' ') {
                id = "";
            }
        }
        id += "2022";

        return id;
    }

    public int contorNumarVocaleIntreConsoane(String text) {

        int ct = 0;

        for (int i = 1; i < text.length() - 1; i++) {
            if (isVocala(text.charAt(i)) && !isVocala(text.charAt(i - 1)) && !isVocala(text.charAt(i + 1)) && text.charAt(i + 1) != ' ' && text.charAt(i - 1) != ' ') {
                ct++;
            }
        }
        return ct;
    }

    public String inlocuireVocale(String text) {

        String nou = "";

        for (int i = 0; i < text.length(); i++) {
            if (isVocala(text.charAt(i))) {
                nou += Character.toUpperCase(text.charAt(i));
            } else {
                nou += text.charAt(i);
            }
        }
        return nou;
    }

    public String modificareSir(String text) {

        String nou = "";

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i + 1) == ' ' || text.charAt(i + 1) == '.') {
                if (text.charAt(i) != ' ') {
                    nou += '5';
                }

            } else {
                nou += text.charAt(i);
            }
        }
        nou += '.';
        return nou;
    }

    public Boolean isConsoaneSiIVocala(String text) {

        for (int i = 0; i < text.length(); i++) {
            if (isVocala(text.charAt(i))) {
                if (text.charAt(i) != 'i') {
                    return false;
                }
            }
        }
        return true;
    }

    public String prescurtareText(String text) {

        String nou = "";
        nou += text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)) && text.charAt(i - 1) == ' ') {
                nou += text.charAt(i);
            }

        }
        return nou;
    }

    public int[] frecventaLitere(String text) {


        int[] frecventa = new int[256];


        for (int i = 0; i < text.length(); i++) {

            frecventa[text.charAt(i)]++;
        }
        return frecventa;


    }

    public int frecventaMax(String text){

        int[]frecventa = frecventaLitere(text);
        int max = 0;

        for (int i = 0; i < frecventa.length; i++){

            if (frecventa[i] > max){
                max = frecventa[i];
            }

        }

        return max;
    }

    public void prefixe(String text){

        for (int i = text.length(); i >= 0; i--){

            System.out.println(text.substring(0, i));

        }

    }

    public void sufixe(String text){

        for (int i = 0; i < text.length(); i++){

            System.out.println(text.substring(i));

        }

    }

    public int indexPrimVocala(String cuv){

        for (int i =0; i < cuv.length();i++){
            if (isVocala(cuv.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    public int indexUltimConsoana(String cuv){

        for (int i =cuv.length()-1; i >=0; i--){
            if (!isVocala(cuv.charAt(i))){
                return i;
            }
        }
        return -1;

    }

    public String interschimbareLitere(String cuv, int poz1, int poz2){

        char[] cuvArray = cuv.toCharArray();

        char aux = cuvArray[poz1];
        cuvArray[poz1] = cuvArray[poz2];
        cuvArray[poz2] = aux;


        return new String(cuvArray);
    }

    public String inserareStea(String text){

        String nou = "";

        for (int i =0 ; i<text.length();i++){
            if (isVocala(text.charAt(i))){
                nou += text.charAt(i);
                nou += '*';
            }else{
                nou += text.charAt(i);
            }
        }
        return nou;
    }

    public Boolean isPalindrom(String cuv)
    {

        for (int i =0, j = cuv.length()-1; i < j; i++, j--){

            if ( cuv.charAt(i) != cuv.charAt(j)){
                return false;
            }

        }
        return true;
    }


}



