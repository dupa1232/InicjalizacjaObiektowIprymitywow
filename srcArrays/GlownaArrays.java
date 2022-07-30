public class GlownaArrays {
    public static void main(String[] args) {
        //to jest tylko deklaracja!!!!!
        int[] tablica;
        int tablicaInna[];
        //tak się inicjalizuje tablicę - trzeba użyć "new" oraz podać jej rozmiar!
        tablica = new int[2];
//        System.out.println(tablicaInna); /// narzeka, że tablica nie jest zainicjaliowana!
        System.out.println(tablica); // nie narzeka, że tablica nie jest zainicjalizowana, ale zwraca ~śmeci w postaci hasha?



        for(int i = 0 ; i < tablica.length ; i++) {
            System.out.println(tablica[i]);
        }
        // w powyższym przypadku zwróci 0 (zero) dwa razy. Dla boolean zwróciłoby - false, String - null, Inna klasa, zdefiniowana przez nas - null, double - 0.0


//        Inicjalizacja z wypełnieniem:
        int[] asd = new int[] {1,2,3};

//        Można też przypisywać, czyli:
        int[] asd2 = new int[3];
        asd2[0] = 1;
        asd2[1] = 4;
//        Itd.

//        Dostawać do tablicy można też poprzez pętlę foreach
        for(int el : asd2) {
            System.out.println("dupa - " +el);
        }

//      xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  Użycie typu obiektowego do tablicy:
        Student[] studenty = new Student[3];
        studenty[0] = new Student(1, "jacek");
        studenty[1] = new Student(2, "Zosia");
        studenty[2] = new Student(); //// bez tego, oraz bez domyślnego, pustego konstruktora, leciał NPE - logiczne, w pętli odwoływaliśmy się do nullowego obiektu

        for(Student studencik : studenty) {
            System.out.println(studencik.no + " " + studencik.name);
        }
        /*
        Zwraca:
        1 jacek
        2 Zosia
        0 null
         */


        Student[] studenty2 = new Student[3];
        studenty2[0] = new Student(1, "jacek");
        studenty2[1] = new Student(2, "Zosia");

        for(Student studencik : studenty2) {
            System.out.println(studencik); /// takie odwołanie, bez obiektu z domyślnm konstruktorem, powoduje, że NPE nie leci, jednak drukuje w dwóch wcześniejszych
            //obiektach (?)hashe, a trzeci jako "null" (czyli zgodnie z tym, co pisałem wyżej, jest zwracane dla typów obiektowych)
        }
        /*
        Zwraca:
        Student@73f792cf
        Student@2ed94a8b
        null
         */

    }


}
