public class Triangle implements Shape{
        private double length;

    /**
     *
     * @param length
     */
    public Triangle(double length){
            this.length = length;
            if(length <=0){
                throw new InvalidGeometricalDimensionException();
            }
        }

        /**
         *
         * @return
        */
    @Override
        public double getArea(){
            return length * Math.sqrt(3)/2;
        }

        /**
        *
        * @return
         */
    @Override
        public double getPerimeter(){
            return length * 3;
        }

    }
