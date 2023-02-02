package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AdjacencyList alist = new AdjacencyList();
        alist.addNode(new Node('g'));
        alist.addNode(new Node('t'));
        alist.addNode(new Node('r'));
        alist.addNode(new Node('t'));
        alist.addNode(new Node('h'));

        alist.addEdge(3,4);
        alist.addEdge(1,4);
        alist.addEdge(1,3);
        alist.addEdge(2,4);
        alist.addEdge(0,1);

        alist.print();
    }
}