
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter2 extends PApplet
{   
    int länge=50;
    int abstand=20;
    int start=15;
    int durchmesser=abstand*13/10;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(0,153,255);
        fill(0);
        quadrate();
        fill(255);
        noStroke();
        kreise();
    }

    public void quadrate()
    {
        for (int reihe=0; reihe<7; reihe++) {
            for (int anzahl=0; anzahl<7; anzahl++) {
                square(start+reihe*(länge+abstand), start+anzahl*(länge+abstand), länge);
            }
        }
    }

    public void kreise() 
    {
        for (int reihe=0; reihe<6; reihe++) {
            for (int anzahl=0; anzahl<6; anzahl++) {
                 ellipse(start+länge+abstand/2+(länge+abstand)*reihe, start+länge+abstand/2+(länge+abstand)*anzahl, durchmesser, durchmesser);
            }
        }
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter2.class.getName() });
    }

}
