package sample;

/**
 * FiveBandCalculator est la classe de normalisation de la valeur d'une résistance 5 bandes et affichage de son code couleur
 * @author Laurent Chevalier Guillaume Maerten
 */
public class FiveBandCalculator extends Resistor{
    private FiveBandCalculator()
    {}

    /** Instance unique pré-initialisée */
    private static FiveBandCalculator INSTANCE = new FiveBandCalculator();

    /** Point d'accès pour l'instance unique du singleton
     * @return INSTANCE*/
    public static FiveBandCalculator getInstance()
    {	return INSTANCE;
    }
}
