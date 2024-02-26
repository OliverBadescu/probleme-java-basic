package problems;

public class solutii {

    Probleme probleme = new Probleme();


    // 2) todo: Sa se scrie un program care permite stergerea tuturor aparitiilor primei litere

    public void sol1(){
        String cuvant = "mamaie";

        String rezultat = probleme.stergereLitera(cuvant);

        System.out.println("Cuvantul modificat este: " +rezultat);

    }


    // 3) todo: Sa se scrie un program care afiseaza cuvintele obtinute din cuvantul inital prin eliminarea succesiva a primului si ultimul ccaracter al sirului ???
    // exemplu: Pentru 'Deosebit', se va afisa: eosebi, oseb, se

    public void sol2(){

        String cuvant = "Deosebit";

        probleme.afisareFaraPrimUltim(cuvant);


    }


    // 4) todo: Se considera o matrice de dimensiu nxm cu elemente de tip sir de caractere. Creati un program care afiseaza sirul de caractere de lungime maxima de pe fiecare sir

    public void sol3(){

        String[][] matrice = {
                {"matrice", "test" , "mere"},
                {"cuvant", "celmailungcuvant", "ana"},
                {"testtest", "abs", "jva"}
        };
        int n = 3;
        int m = 3;

        String rezultat = probleme.afisareCelMaiLungSirDinMatrice(matrice, n, m);
        System.out.println("Cel mai lung sir este: " +rezultat);
    }












}
