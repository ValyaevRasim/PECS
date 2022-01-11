public class Camera extends Product {
    private String pixel;

    public Camera(String name, int price) {
        super(name, price);
    }

//    public Camera(String pixel) {
//        this.pixel = pixel;
//    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "pixel='" + pixel + '\'' +
                '}';
    }

}
