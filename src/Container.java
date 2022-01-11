public class Container <T extends Product>{
    T item;

    Container<Product> c1;
    Container<Camera> c2;
    Container<Phone> c3;
//    Container<String> c4; //ERROR

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item=" + item +
                '}';
    }
}
