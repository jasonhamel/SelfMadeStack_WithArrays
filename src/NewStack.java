public class NewStack {
    private final String[] array;
    private int position = 0;
    private String top;
    private String bottom;

    public NewStack() {
        this.array = new String[10];
    }

    public void push(String toAdd) {
        if (isEmpty()) {
            array[position] = toAdd;
            this.top = toAdd;
            this.bottom = toAdd;
            position++;
            return;
        }
        array[position] = toAdd;
        this.top = toAdd;
        position++;
    }

    public String peek() {
        return this.top;
    }

    public String pop() {
        if (position < 1) {
            return null;
        }
        String toReturn = this.top;
        if (position == 1) {
            this.bottom = null;
            this.top = null;
            position--;
            array[position] = null;
            return toReturn;
        }
        position--;
        this.top = array[position - 1];
        array[position] = null;
        return toReturn;
    }

    public boolean isEmpty() {
        return position == 0;
    }
}