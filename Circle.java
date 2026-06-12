public class Circle implements Shape{
    private double radius;

    /** Creates a circle object with the specified radius
     * @throws InvalidGeometricalDimensionaException if radius is less than or equal to zero
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
        if(radius <=0){
            throw new InvalidGeometricalDimensionException();
        }
    }

    /**
     * Calculate the area of the circle
     * @return the area of the circle
     */
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    /**Calculate the circumference of the circle
     *
     * @return the circumerence of the circle
     */
    @Override
    public double getPerimeter(){
        return 2* Math.PI *radius;
    }
}
