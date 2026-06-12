  /**
     * Exception thrown when a geometric dimension
     * is less than orequal to zero
     */

public class InvalidGeometricalDimensionException extends IllegalArgumentException{
     /**
     * Constructs an exception with a default error message
     */
    public InvalidGeometricalDimensionException(){
        super("Geometrical dimensions must be greater than zero");
    }

    /**
     * Constructs an exception with a custom error message
     * @param message the error message
     */
    public InvalidGeometricalDimensionException(String message){
        super(message);
    }
}
