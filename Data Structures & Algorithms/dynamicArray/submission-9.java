class DynamicArray {
    private Object[] list;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        list = new Object[capacity];
        this.capacity = list.length;
    }

    public int get(int i) {
        return (int) list[i];
    }

    public void set(int i, int n) {
        list[i] = n;
    }

    public void pushback(int n) {
        if (this.getSize() == capacity) {
            resize();
            this.list[size] = n;
            this.size++;
            return;
        }
        list[size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        return (int) list[size];
    }

    private void resize() {
        final var newCapacity = list.length * 2;
        Object[] newList = new Object[newCapacity];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }

        this.capacity = newList.length;
        this.list = newList;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}