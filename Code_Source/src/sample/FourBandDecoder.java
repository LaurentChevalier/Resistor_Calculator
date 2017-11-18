package sample;

/**
 * FourBandDecoder est la classe de décodage du code couleur d'une résistance à 4 bandes
 * @author Laurent Chevalier Guillaume Maerten
 */
public class FourBandDecoder extends Resistor {
    /** Constructeur privé */
    private FourBandDecoder()
    {}

    /** Instance unique pré-initialisée */
    private static FourBandDecoder INSTANCE = new FourBandDecoder();

    /** Point d'accès pour l'instance unique du singleton
     * @return INSTANCE*/
    public static FourBandDecoder getInstance()
    {	return INSTANCE;
    }
}
