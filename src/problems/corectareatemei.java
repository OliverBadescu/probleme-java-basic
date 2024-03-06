package problems;

public class corectareatemei {

    Probleme probleme = new Probleme();
    // Sa se scrie un program care afiseaza cuvintele obtinute din cuvantul inital prin eliminarea succesiva a primului si ultimul ccaracter al sirului ???
    // exemplu: Pentru 'Deosebit', se va afisa: eosebi, oseb, se

    public void sol1() {


        String text = "Deosebit";

        probleme.afisarePrimUltim(text);


    }


    // Sa se creeze un program care transforma literele mici ale unui cuvant in litere mari si literele mari in litere mici

    public void sol2() {

        String cuvant = "MioritIC";
        String cuvantNou = probleme.modificareCuvantMicMare(cuvant);

        System.out.println(cuvantNou);


    }


    // Se considera o lista cu prenume ale elevilor dintr-o clasa. Prenumele unei fete este recunoscut datorita faptului ca fie are ultima litera 'a' sau
    // fie este 'Carmen' sau 'Alice'. Sa se afizese nuamrul fetelor din clasa.

    public void sol3() {

        String[] lista = {"Alice", "Ana", "Silviu", "Alex", "Patricia"};

        System.out.println(probleme.contorNumarFete(lista));


    }


    // De la tastatura se citeste un text codifficat dupa regula urmatoare: in fata fiecarui caracter este scris un numar ce reprezinta numarul de aparitii consecutive
    // al acestuia. Realizati un program care decodifica textul. Exemplu: '1G11o1L' se va afisa 'Goooooooooool' ????

    public void sol4() {
        String text = "2G9o1L";

        String rez = probleme.decodificare(text);
        System.out.println(rez);


    }


    // Parametrii s și id permit accesul la câte un șir de maximum 50 de caractere, s memorând, separate printr-un singur spațiu, prenumele și numele unei persoane,
    // fiecare fiind format numai din litere ale alfabetului englez. Funcția va memora în id numele persoanei menționate, urmat de 2022.
    // exemplu: După apelul FNume("David Popovici", id), variabila id va memora Popovici2022.

    public void sol5() {

        String nume = "David Popovici";
        String id = probleme.Fnume(nume);

        System.out.println(id);

    }


    // Se dă un șir de caractere. Să se determine câte vocale din șir sunt cuprinse între două consoane.

    public void sol6() {

        String text = "oasele sunt fragile";
        int ct = probleme.contorNumarVocaleIntreConsoane(text);

        System.out.println("Numarul de vocale este: " + ct);


    }


    // Să se afişeze şirul obţinut prin înlocuirea fiecărei vocale cu litera mare corespunzătoare.

    public void sol7() {

        String text = "romancier";
        String nou = probleme.inlocuireVocale(text);

        System.out.println(nou);


    }

    // Cuvintele din text sunt separate prin unul sau mai multe spații. Să se modifice textul citit din fișier prin înlocuirea ultimei litere a fiecărui cuvânt cu cifra 5.


    public void sol8() {

        String text = "ana are   multe   mare si o gutuie.";
        String rez = probleme.modificareSir(text);

        System.out.println(rez);
    }


    // Scrieţi un program care citeşte de la tastatură un cuvânt de tipul precizat și afișează pe ecran mesajul DA în cazul în care cuvântul conține doar consoane şi, eventual, vocala i, sau mesajul NU în caz contrar.

    public void sol9() {

        String text = "instimbil";

        if (probleme.isConsoaneSiIVocala(text)) {
            System.out.println("DA");
        } else {
            System.out.println("NU");
        }

    }


    // Se dă o propoziție formată din litere mari și mici ale alfabetului englez, cifre, spații și semne de punctuație, în care literele mari și mici se consideră identice.
    // Determinați vocala din șir cu număr maxim de apariții.


    public void sol10() {

        String text = "Ana are 5 mere si trei nuci";
        int frecmax = probleme.frecventaMax(text);

        System.out.println(frecmax);






    }




}