import java.util.Scanner;

public class Rechnen {

    Scanner scanner = new Scanner(System.in);

    public void Auswahl(){

        System.out.println("Welche Flaeche moechten Sie berechnen?");
        System.out.println("[1] Kreis");
        System.out.println("[2] Quadrat");
        System.out.println("[3] Rechteck");
        System.out.println("[4] Dreieck");
        int wahl = scanner.nextInt();

        switch(wahl){

            case 1: kreisFlaeche();
            break;

            case 2: quadratFlaeche();
            break;

            case 3: rechtechFlaeche();
            break;

            case 4: dreieckFlaeche();
            break;
        }

    }

    public void kreisFlaeche(){

        System.out.println("Bitte den Radius in CM eingeben: ");
        double radiusKreis = scanner.nextDouble();

        double kreisflaeche = (radiusKreis * Math.PI);

        System.out.println("Die Kreisflaeche ist " + kreisflaeche + " Quadratzentimeter groß.");
    }

    public void quadratFlaeche(){


        System.out.println("Bitte die Seitenlaenge in CM eingeben: ");
        double seitenlaengeQuadrat = scanner.nextDouble();

        double quadratFlaeche = (seitenlaengeQuadrat * seitenlaengeQuadrat);

        System.out.println("Die Flaeche des Quadrats ist " + quadratFlaeche + " Quadratzentimeter groß.");
    }

    public void rechtechFlaeche(){

        System.out.println("Bitte die Seitenlaenge A eingeben: ");
        double seitenlaengeA = scanner.nextDouble();
        System.out.println("Bitte die Seitenlaenge B eingeben: ");
        double seitenlaengeB = scanner.nextDouble();

        double flaecheRechteck = (seitenlaengeA * seitenlaengeB);

        System.out.println("Die Flaeche des Rechtecks ist " + flaecheRechteck + " Quadratzentimeter groß.");
    }

    public void dreieckFlaeche(){

        System.out.println("Bitte die Seitenlaenge A eingeben: ");
        double seiteDreieckA = scanner.nextDouble();
        System.out.println("Bitte die Seitenlaenge B eingeben: ");
        double seiteDreickB = scanner.nextDouble();

        double flaecheDreieck = ((seiteDreieckA * seiteDreickB) / 2);

        System.out.println("Die Flaeche des Dreiecks ist " + flaecheDreieck + " Quadratzentimeter groß.");
    }
}
