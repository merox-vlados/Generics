public class Box<K, V, F> {
    private K key;
    private V value;

    private F floatValue;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public F getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(F floatValue) {
        this.floatValue = floatValue;
    }

    public Box(K key, V value, F floatValue) {
        this.key = key;
        this.value = value;
        this.floatValue = floatValue;
    }
}
