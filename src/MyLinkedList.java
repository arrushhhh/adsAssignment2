import MyList.MyList;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private class MyNode {
        T item;
        MyNode next;
        MyNode prev;

        MyNode(T item) {
            this.item = item;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public void add(T item) {
        addLast(item);
    }

    public void set(int index, T item) {
        getNode(index).item = item;
    }

    public void add(int index, T item) {
        if (index == size) {
            addLast(item);
            return;
        }
        MyNode nextNode = getNode(index);
        MyNode newNode = new MyNode(item);
        newNode.next = nextNode;
        newNode.prev = nextNode.prev;
        if (nextNode.prev != null)
            nextNode.prev.next = newNode;
        else
            head = newNode;
        nextNode.prev = newNode;
        size++;
    }

    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = head;
        size++;
    }

    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        return getNode(index).item;
    }

    public T getFirst() {
        return head.item;
    }

    public T getLast() {
        return tail.item;
    }

    public void remove(int index) {
        removeNode(getNode(index));
    }

    public void removeFirst() {
        removeNode(head);
    }

    public void removeLast() {
        removeNode(tail);
    }

    private void removeNode(MyNode node) {
        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;
        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;
        size--;
    }

    private MyNode getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }

    public void sort() {
        for (MyNode i = head; i != null; i = i.next) {
            for (MyNode j = i.next; j != null; j = j.next) {
                if (i.item.compareTo(j.item) > 0) {
                    T tmp = i.item;
                    i.item = j.item;
                    j.item = tmp;
                }
            }
        }
    }

    @Override
    public int index0f(Object object) {
        return 0;
    }

    public int indexOf(Object object) {
        int index = 0;
        for (MyNode current = head; current != null; current = current.next, index++) {
            if (current.item.equals(object)) return index;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        int index = size - 1;
        for (MyNode current = tail; current != null; current = current.prev, index--) {
            if (current.item.equals(object)) return index;
        }
        return -1;
    }

    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        int i = 0;
        for (MyNode current = head; current != null; current = current.next)
            arr[i++] = current.item;
        return arr;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private MyNode current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                T item = current.item;
                current = current.next;
                return item;
            }
        };
    }
}
