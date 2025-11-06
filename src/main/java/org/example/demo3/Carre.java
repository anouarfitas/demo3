package org.example.demo3;

import javafx.scene.paint.Color;

public class Carre extends HelloApplication {
    private int perimetre;
    private int aire;
    private Color couleur;

    public Carre(int perimetre, int aire, Color couleur) {
        this.perimetre = perimetre;
        this.aire = aire;
        this.couleur = couleur;
    }
    changerCouleur(couleur);

}
public void changerCouleur(Color couleur){
    couleur = Color.RED;
}