public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.sort();
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();


        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("C");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.sort();
        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println();


        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack pop: " + stack.pop());


        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("One");
        queue.enqueue("Two");
        System.out.println("Queue dequeue: " + queue.dequeue());


        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(30);
        heap.insert(10);
        heap.insert(20);
        System.out.println("Min in heap: " + heap.extractMin());
    }
}
