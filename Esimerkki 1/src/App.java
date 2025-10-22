public class App {
    public static void main(String[] args) throws Exception {
        int luku1;
        int luku2;
        int tulo;
        int erotus;
        int summa;
        int jako;
        String tekijä;

        tekijä = "Veke"; 
        luku1 = 2;
        luku2 = 4;
        tulo = luku1 * luku2;
        summa = luku1 + luku2;
        erotus = luku1 - luku2;
        jako = luku1 / luku2;
        int luku3;
        luku3 = 501;
        if (luku3>500)
        System.out.println(luku3);
        // Arvot

        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.println("Ohjelman tekijä " + tekijä);

       // System.out.println(luku1);

        System.out.println("luku1 on numero " + luku1);
        System.out.println("luku2 on numero " + luku2);
        System.out.println("luvut kerrottuna ovat " + tulo);
        System.out.println("luvut summattuna ovat " + summa);
        System.out.println("luvut erotettuna ovat " + erotus);
        System.out.println("luvut jaettuna ovat " + jako);
        System.out.println(luku1 + "*" + luku2 + "=" + tulo);

        // IF
        boolean laitepaalla = false;
        //kayttaja napauttaa virtapainiketta
        if (laitepaalla == false)
        {
        //ehto on tosi eli mitä silloin tapahtuu
        System.out.println("Laite käynnistyy");
        laitepaalla = true;
        }
        else
        {
        System.out.println("Laite sammutetaan");
        laitepaalla = false;
        }
    }
}
