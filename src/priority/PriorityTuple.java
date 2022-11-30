package priority;

public class PriorityTuple<T> implements Comparable<PriorityTuple<T>> {
    private int priority;
    private T value;

    public PriorityTuple(int priority, T value) {
        this.priority = priority;
        this.value = value;
    }

    public int Priority() {
        return priority;
    }

    public T Value() {
        return value;
    }

    @Override
    public int compareTo(PriorityTuple<T> o) {
        return Integer.compare(this.Priority(), o.Priority());
    }
}
