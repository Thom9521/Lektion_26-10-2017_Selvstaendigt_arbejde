package thom9521;

public class AbstractBMW extends AbstractSuperclassBil {

        private double width;
        private double height;

        public AbstractBMW() {
        }

        public AbstractBMW(
                double width, double height) {
            this.width = width;
            this.height = height;
        }

        public AbstractBMW(
                double width, double height, String color, boolean filled) {
            this.width = width;
            this.height = height;
            setColor(color);

        }

        /** Return width */
        public double getWidth() {
            return width;
        }

        /** Set a new width */
        public void setWidth(double width) {
            this.width = width;
        }

        /** Return height */
        public double getHeight() {
            return height;
        }

        /** Set a new height */
        public void setHeight(double height) {
            this.height = height;
        }

        /** Return area */
        public double getAreal() {
            return width * height;
        }

        /** Return perimeter */
        public double getOmkreds() {
            return 2 * (width + height);
        }
    }

