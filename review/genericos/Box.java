public class Box<T> {
    private T t; // T es el parámetro de tipo

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
