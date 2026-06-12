public class Triangle implements Shape{
        private double length;

    /**
     *Calculate the area of the equilateral triangle Object with the specific side
     * @param length each side of the triangle
     * @throws InvalidGeometricalDimensionException if length is less than or equalto zero
     */
    public Triangle(double length){
            this.length = length;
            if(length <=0){
                throw new InvalidGeometricalDimensionException();
            }
        }

        /**
     *Calculate the area of the equilateral triangle
     * @param length the area of the triangle
     */
    @Override
        public double getArea(){
            return length * Math.sqrt(3)/2;
        }

       /**
         *Calculate the perimeter of the triangle
         * @return the perimeter of the triangle
        */
    @Override
        public double getPerimeter(){
            return length * 3;
        }

    }
