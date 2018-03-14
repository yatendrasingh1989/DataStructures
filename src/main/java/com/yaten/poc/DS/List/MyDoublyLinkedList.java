package com.yaten.poc.DS.List;

public class MyDoublyLinkedList<X> {

    private X item;
    private DoublyLinkedListNode first;
    private DoublyLinkedListNode last;





    private class DoublyLinkedListNode
    {
        private X item;
        private DoublyLinkedListNode nextNode;
        private DoublyLinkedListNode previousNode;

        public DoublyLinkedListNode(X item) {
            this.item = item;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }

        public DoublyLinkedListNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(DoublyLinkedListNode nextNode) {
            this.nextNode = nextNode;
        }

        public DoublyLinkedListNode getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(DoublyLinkedListNode previousNode) {
            this.previousNode = previousNode;
        }
    }
}
