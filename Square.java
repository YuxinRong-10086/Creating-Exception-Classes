public class Square implements Shape {
    private double side;

    /**
     *Creates a Square object with the specified side length.
     * @param side
     * @throw InvalidGeometricalDimensionException if side is less than or equal to zero.
     */@
    public Square(double side){
        if (side <=0){
            throw new InvalidGeometricalDimensionException();

        }
        this.side = side;
    }

    /**
     *Calculate the area of the square
     * @return the area of the square
     */
    @Override
    public double getArea(){
        return side * side;
    }

    /**
     * Calculate the perimeter of the square
     * @return the perimeter of the square
     */
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
}
