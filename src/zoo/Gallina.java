package zoo;
/**
 * La clase Gallina representa a un tipo de Ave que pertenece al zoo.
 * Las gallinas tienen características específicas como su sonido de cacareo y ciertas acciones que pueden realizar.
 */
public class Gallina extends Ave {
 
    /** El sonido característico de la gallina. */
    private String cacareo = "GRRRRR";
    
    /** 
     * Constructor por defecto de Gallina.
     * Crea una nueva instancia de Gallina sin especificar ningún atributo.
     */
    public Gallina () {}
    
    /** 
     * Constructor de Gallina con parámetros.
     * Crea una nueva instancia de Gallina con los atributos especificados.
     * @param habitat El hábitat en el que vive la gallina.
     * @param comida El tipo de comida que consume la gallina.
     * @param longevidad La longevidad esperada de la gallina en años.
     * @param periodoIncubacion El período de incubación de los huevos de la gallina en días.
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /** Establece el sonido de cacareo de la gallina.
     * @param cacareo El nuevo sonido de cacareo de la gallina.
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /** Obtiene el sonido de cacareo de la gallina.
     * @return El sonido de cacareo actual de la gallina.
     */
    public String getCacareo () { return cacareo; }
    
    /** 
     * Realiza el acto de rugir, que en este caso es emitir el sonido característico de la gallina.
     */
    public void rugir () { System.out.println(cacareo); }
    
    /** 
     * Realiza el acto de comer, mostrando un mensaje indicando qué está comiendo la gallina.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /** 
     * Realiza el acto de desplazarse, que en el caso de la gallina implica volar con dificultad.
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
