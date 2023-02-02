package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {
    ArrayList<LinkedList<Node>> LinkedListcontainer;

    public void AdjacencyList(){
        LinkedListcontainer = new ArrayList<>();
    }
    public void addNode(Node node){
        LinkedList<Node> newEdgeContainer = new LinkedList<>();
        newEdgeContainer.add(node);
        LinkedListcontainer.add(newEdgeContainer);
    }
    public void addEdge(int src, int dst){
        LinkedList<Node> existEdgeContainer = LinkedListcontainer.get(src);
        Node dstnode = LinkedListcontainer.get(dst).get(0);
        existEdgeContainer.add(dstnode);
    }


    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> existEdgeContainer = LinkedListcontainer.get(src);
        Node dstnode = LinkedListcontainer.get(dst).get(0);
        for (Node node : existEdgeContainer) {
            if(node == dstnode){
                return true;
            }
        }
        return false;
    }
    public void print(){
        for (LinkedList<Node> existEdgeContainer: LinkedListcontainer){
            for(Node node: existEdgeContainer){
                System.out.print(node + " -> ");
            }
            System.out.println();
        }
    }
}
