package problems;

public class tema {

    Probleme probleme = new Probleme();

    // 1) todo: Să se afişeze lista prefixelor şi lista sufixelor cuvântului dat.

    public void sol1(){

        String cuv = "program";

        probleme.prefixe(cuv);
        probleme.sufixe(cuv);
    }

    // 2) todo: Scrieți un program care citește de la tastatură un text de tipul precizat și construiește în memorie, apoi afișează pe ecran, un șir de caractere ce reprezintă acronimul corespunzător numelui citit.
    // todo: Acronimul este format din primul caracter al fiecărui cuvânt al numelui care începe cu majusculă.

    public void sol2() {

        String text = "Universitatea de Arte Plastice BUCURESTI";
        String rez = probleme.prescurtareText(text);

        System.out.println(rez);


    }

    // 3) todo: Să se scrie un program care citește un cuvânt și îl afișează după interschimbarea primei vocale cu ultima consoană.

    public void sol3(){

        String cuv = "PrograM";

        cuv = probleme.interschimbareLitere(cuv, probleme.indexPrimVocala(cuv), probleme.indexUltimConsoana(cuv));

        System.out.println(cuv);

    }


    // 4) todo: Să se scrie un program care citește un text și inserează după fiecare vocală caracterul *.

    public void sol4(){

        String text=  "ana are mere";

        String nou = probleme.inserareStea(text);

        System.out.println(nou);

    }

    // 5) todo: Marcel a primit o tastatura noua de ziua lui. El vrea sa scrie un text folosind doar litere ale alfabetului englez si spatii. El a descoperit tasta CapsLock, care atunci cand este apasata se activeaza.
    //  todo: Daca tasta este activata, atunci toate literele care le va scrie in continuare, pana in momentul in care tasta este dezactivata (apasand CapsLock inca o data) vor fi majuscule. ???

    public void sol5(){



    }


    // 6) todo: Să se scrie un program care citește mai multe cuvinte și determină despre fiecare dacă este palindrom.

    public void sol6(){

        String cuv = "aerisirea";

        if(probleme.isPalindrom(cuv)){
            System.out.println("Este palindrom");
        }else{
            System.out.println("Nu este palindrom");
        }

    }

}
