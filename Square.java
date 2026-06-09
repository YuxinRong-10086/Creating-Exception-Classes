public class Square implements Shape {
    private double side;

    /**
     *
     * @param side
     */
    public Square(double side){
        if (side <=0){
            throw new InvalidGeometricalDimensionException();

        }
        this.side = side;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return side * side;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
}
