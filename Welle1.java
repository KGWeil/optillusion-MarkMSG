
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Welle1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Welle1 extends PApplet
{   
    int s=70;
    int d=s/4;
    int a=3;
    int farbwechsel (int farbe) {
        if (farbe == 255) {
            farbe = 0;
        } else {
            farbe = 255;
        }
        return farbe;
    }
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,300);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        //zeichneQuadrat( 20, 20, 0, true);
        alleQuadrate();
        zeichneLinien();
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
    
    public void zeichneQuadrat( int x, int y, int farbe, boolean links)
    {
        fill(farbe);
        noStroke();
        square(x,y,s);
        fill(farbwechsel(farbe));
        ellipseMode(CORNERS);
        noStroke();
        if ( links == true ) {
            ellipse( x+a, y+a, x+d+a, y+d+a );  // links oben
            ellipse( x+a, y + 3*d-a, x+d+a, y+s-a ); // links unten
        } else {
            ellipse( x + 3*d-a, y+a, x+s-a, y+d+a );  // rechts oben
            ellipse( x + 3*d-a, y + 3*d-a, x+ s-a, y+s-a );  // rechts unten
        }

    }
    
    public void alleQuadrate()
    {
        noStroke();
        int aktuelleFarbe=255;
        boolean aktuellePosition=true;
        for (int r=0; r<4; r++) {
            for (int a=0; a<8; a++) {
                zeichneQuadrat( d+s*a, d+s*r, aktuelleFarbe, aktuellePosition);
                aktuelleFarbe = farbwechsel(aktuelleFarbe);
            }
            aktuelleFarbe = farbwechsel(aktuelleFarbe);
            if (aktuellePosition==true) {
                aktuellePosition=false ;
            } else {
                aktuellePosition=true;
            }
        }
    }

    public void zeichneLinien() {
        stroke(8, 250, 78);
        strokeWeight(3);
        for (int p=1; p<4; p++) {
            line(d-a, d+s*p, d+a+s*8, d+s*p);
        }
    }
    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Welle1.class.getName() });
    }

}
