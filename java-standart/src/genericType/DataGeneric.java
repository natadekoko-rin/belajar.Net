package genericType;

public class DataGeneric<T> {
    private T data;

    public DataGeneric(T data) {
        this.data = data;
    }

    public DataGeneric() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
