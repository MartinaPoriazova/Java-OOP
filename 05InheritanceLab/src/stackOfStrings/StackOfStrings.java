package stackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;
    private int index;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        int lastIndex = data.size() - 1;
        return this.data.remove(lastIndex);
    }

    public String peek() {
        int lastIndex = data.size() - 1;
        return this.data.get(lastIndex);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
