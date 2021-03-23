public class Box<T> {
    private T element;

    public final T get() {
        return this.element;
    }

    public final void put(final T ob) {
        this.element = ob;
    }
}
