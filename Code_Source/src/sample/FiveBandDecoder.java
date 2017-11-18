package sample;

/**
 * FiveBandDecoder est la classe de décodage du code couleur d'une résistance à 5 bandes
 * @author Laurent Chevalier Guillaume Maerten
 */
public class FiveBandDecoder extends Resistor{
    /** Constructeur privé */
    private FiveBandDecoder()
    {}

    /** Instance unique pré-initialisée */
    private static FiveBandDecoder INSTANCE = new FiveBandDecoder();

    /** Point d'accès pour l'instance unique du singleton
     * @return INSTANCE */

    public static FiveBandDecoder getInstance()
    {	return INSTANCE;
    }
}
