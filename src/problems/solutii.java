package problems;

import java.util.Arrays;

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


    // 5) todo: Sa se creeze un program care transforma literele mici ale unui cuvant in litere mari si literele mari in litere mici ?

    public void sol4(){

        String cuvant = "MioritIC";
        probleme.modificareCuvant(cuvant);

        System.out.println("Sirul modificat este: " +cuvant);



    }


    // 6) todo: Sa se determine cuvantul de lungime maxima care se poate forma prin concatenarea a doua dintre cuvintlele citite
    public void sol5(){

        String[] sir = {"mama", "are", "conduce", "paine", "vine"};

        probleme.sortareDescrescatoare(sir);

        System.out.println("Cuvantul de lungime maxima este: ");
        System.out.println(sir[0] + sir[1]);
    }


    // 7) todo: Sa se determine cuvantul cel mai mic in ordine lexicografica obtinu prin concatenarea a doua dintre cuvintele citite ???

    public void sol6(){



    }


    // 8) todo: Realizati un program care sa afiseze fiecare propozitie pe o singura linie

    public void sol7(){

        String text = "Fie A un punct fix. Presupunem B punct mobil";
        probleme.afisareLiniiNoi(text);


    }


    // 9) todo: Se considera o lista cu prenume ale elevilor dintr-o clasa. Prenumele unei fete este recunoscut datorita faptului ca fie are ultima litera 'a
    // todo: fie este 'Carmen' sau 'Alice'. Sa s afizese nuamrul fetelor din clasa si cel mai mare prenume in sens lexicografic ale carui litere vor fi transformate in majuscule

    public void sol8(){



    }


    // 10) todo: Se considera doua cuvinte mici, sa se verifice daca acestea rimeaza

    public void sol9(){

        String cuv1 = "armat";
        String cuv2 = "verificat";

        if (probleme.isRimeaza(cuv1, cuv2)){
            System.out.println("Rimeaza");
        }
        else{
            System.out.println("Nu rimeaza");
        }

    }

    // 11) todo: De la tastatura se citeste un text codifficat dupa regula urmatoare: in fata fiecarui caracter este scris un numar ce reprezinta numarul de aparitii consecutive
    // todo: al acestuia.Realizati un program care decodifica textul. Exemplu: '1G11o1L' se va afisa 'Goooooooooool' ????

    public void sol10(){



    }

    // 12) todo: Realizati un program ce afiseza numerele ce apar in text, despartite prin cate un spatiu.

    public void sol11(){

        String text = "Ana are 7 mere si 223 de pere";
        String rezultat = probleme.sirNumere(text);

        System.out.println("Numerele din sir sunt: " +rezultat);


    }


    // 13) todo: Realizati un program care determia cea mai lunga secventa de cifre alaturate din sir ???
    // exemplu: 'a23Bw001234mcv34' se va afisa '001234'

    public void sol12(){



    }


    // 14) todo: Sa se faca o operatie Find-Replace, aceasta operatie inocuieste aparitiile din subsirul s1 cu un alt subsir s2.
    // exemplu: 'are mere si pere' s1 = 're' si s2 = 'rare', se va afisa: 'arare merare si perare.'

    public void sol13(){


    }






}
