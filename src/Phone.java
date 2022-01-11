public class Phone extends Product{
    private String model;

    public Phone(String name, int price) {
        super(name, price);
    }

//    public Phone(String model) {
//        this.model = model;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}
