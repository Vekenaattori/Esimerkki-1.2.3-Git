public class IkaOhjelma {

    public static void main(String[] args) {
        int ika = 40;

        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }

            if (ika >= 16) {
                System.out.println("Saat ajaa kevaria");
            }

        } else if (ika == 18) {
            System.out.println("Olet juuri täysi-ikäinen!");
            System.out.println("Saat ajaa autoa");

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");

            if (ika == 65) {
                System.out.println("Hyviä eläkepäiviä!");
            }

        } else if (ika >= 58) {
            System.out.println("Olet aikuinen");
            System.out.println("Voit halutessasi mennä varhaiseläkkeelle");

        } else {
            System.out.println("Olet aikuinen");
            if (ika % 10 == 0) {
                System.out.println("Onnittelut " + ika + "-vuotispäivän johdosta!");
            }
            if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää!");
            }
        }
        if (ika == 100) {
            System.out.println("Paljon onnea 100-vuotiaalle!");
            System.out.println("Upea saavutus!");
            System.out.println("Toivotamme sinulle hyvää juhlapäivää!");
        }
    }
}