package priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxPriorityQueueImpl<T> implements MinMaxPriorityQueue<T> {
    private List<PriorityTuple<T>> items = new ArrayList<PriorityTuple<T>>();

    @Override
    public void add(T item, int priority) {
        items.add(new PriorityTuple<T>(priority, item));
        Collections.sort(items);
    }

    @Override
    public T minPriorityItem() {
        int size = items.size();

        if (size > 0) {
            return items.get(items.size() - 1).Value();
        } else {
            return null;
        }
    }

    @Override
    public T maxPriorityItem() {
        int size = items.size();

        if (size > 0) {
            return items.get(0).Value();
        } else {
            return null;
        }
    }
}
