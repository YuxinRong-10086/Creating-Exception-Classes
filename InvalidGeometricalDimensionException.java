public class InvalidGeometricalDimensionException extends IllegalArgumentException{
    /**
     * super
     */
    public InvalidGeometricalDimensionException(){
        super("Geometrical dimensions must be greater than zero");
    }

    /**
     *
     * @param message
     */
    public InvalidGeometricalDimensionException(String message){
        super(message);
    }
}
