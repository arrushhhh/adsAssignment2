This project implements custom data structures in Java without using java.util.* collections (except Iterator).

Implemented data structures:

MyArrayList
MyLinkedList (doubly linked list)
MyStack
MyQueue
MyMinHeap

MyArrayList

A dynamic array implementation based on Object[]. 

add()
add(index, item)
get(index)
set(index, item)
remove(index)
sort()
indexOf(), lastIndexOf()
toArray()
clear()
size()

MyLinkedList

A doubly linked list with an internal MyNode class. Methods:

add()
add(index, item)
get(index)
remove(index)
sort()
indexOf(), lastIndexOf()
toArray()
clear()
size()

MyStack

A LIFO stack implemented on top of MyArrayList. Methods:

push(item)
pop()
peek()
isEmpty()
size()
clear()

MyQueue

A FIFO queue implemented using MyLinkedList. Methods:

enqueue(item)
dequeue()
peek()
isEmpty()
size()
clear()

MyMinHeap

A min-heap implemented with MyArrayList. Methods:

insert(item)
extractMin()
peek()
size()
