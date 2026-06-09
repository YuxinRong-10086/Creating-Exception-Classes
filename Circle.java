public class Circle implements Shape{
    private double radius;

    /**
     *
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
        if(radius <=0){
            throw new InvalidGeometricalDimensionException();
        }
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter(){
        return 2* Math.PI *radius;
    }
}
