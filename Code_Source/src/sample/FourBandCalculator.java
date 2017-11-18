package sample;

/**
 * FourBandCalculator est la classe de normalisation de la valeur d'une résistance 4 bandes et affichage de son code couleur
 * @author Laurent Chevalier Guillaume Maerten
 */
public class FourBandCalculator extends Resistor{
    private FourBandCalculator()
    {}

    /** Instance unique pré-initialisée */
    private static FourBandCalculator INSTANCE = new FourBandCalculator();

    /** Point d'accès pour l'instance unique du singleton
     * @return INSTANCE*/
    public static FourBandCalculator getInstance()
    {	return INSTANCE;
    }
}
