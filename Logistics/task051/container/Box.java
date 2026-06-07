package container;

public
    class Box<T> {

    private T content;

    public Box() {
        this.content = null;
    }

    public Box(T content) {
        this.content = content;
    }

    public void put(T item) {
        if (content != null) {
            throw new IllegalStateException(
                "Box must be emptied before reuse."
            );
        }
        this.content = item;
    }

    public T get() {
        if (content == null) {
            throw new IllegalStateException("Box is empty.");
        }
        return content;
    }

    public T getAndClear() {
        T item = get();
        clear();
        return item;
    }

    public boolean isEmpty() {
        return content == null;
    }

    public void clear() {
        this.content = null;
    }

    @Override
    public String toString() {
        String contentStr = isEmpty() ? "EMPTY" : content.toString();
        return "Box{" + contentStr + "}";
    }
}
