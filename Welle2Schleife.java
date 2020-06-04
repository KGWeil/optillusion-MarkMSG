
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Welle2Schleife.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Welle2Schleife extends PApplet
{       
    int d=5;
    int s=53;
    int abstand=10;
    int gruen=0xff1caf38;
    int weiss=0xffffffff;

    int farbwechsel( int farbe) {
        if (farbe == weiss) {
            return gruen;   
        } else { 
            return weiss;
        }
    }
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(700,700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        //zeichneQuadrat( 20, 20, gruen);
        alleQuadrate();
    }

    public void zeichneQuadrat(int x, int y, int farbe) {
         fill(farbe);
         noStroke();
         rect(abstand+x,abstand+y,s,s);
         
         fill(farbwechsel(farbe));
         noStroke();
         rect(abstand+x+d, abstand+y+d, s-2*d, s-2*d);
    }
    
    public void alleQuadrate() {
        noStroke();
        int farbe=gruen;
        int neu_x = 0;
        int neu_y = 0;
        while (neu_y < 700) {
            while (neu_x < 700) {
                zeichneQuadrat( neu_x, neu_y, farbe);
                farbe = farbwechsel(farbe);
                neu_x = neu_x + s;
            }
            farbe=farbwechsel(farbe);
            neu_x = 0;
            neu_y = neu_y + s;
        }
    }
    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Welle2Schleife.class.getName() });
    }

}
