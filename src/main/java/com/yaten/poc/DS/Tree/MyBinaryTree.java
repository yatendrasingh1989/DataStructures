package com.yaten.poc.DS.Tree;

import java.util.Objects;

public class MyBinaryTree<X extends Comparable<X>> {
    private TreeNode rootNode;
    private int size;



    public int getSize(){
        return size;
    }

    public void add(X item){
        TreeNode newNode=new TreeNode(item);
        if(!Objects.isNull(rootNode)){
            rootNode =newNode;
            size++;
        }
       else{
            insert(rootNode,newNode);
        }
    }

    public boolean contains(X item){
    if(null!=getTreeNode(item))
        return true;
    return false;
    }
    private TreeNode getTreeNode(X item){
        TreeNode currentNode=rootNode;
       while(null!=currentNode){
           int val=item.compareTo(currentNode.getItem());
           if(val==0)
               return currentNode;
           else if(val<0)
               currentNode=currentNode.getLeftNode();
           else if(val>0)
               currentNode=currentNode.getRightNode();
       }
        return null;
    }

    private void insert(TreeNode parent, TreeNode child){
        if(parent.getItem().compareTo(child.getItem())<0){
            if(!Objects.isNull(parent.getLeftNode())){
                parent.setLeftNode(child);
                child.setParent(parent);
                size++;
            }
            else{
                insert(parent.getLeftNode(),child);
            }
        }
        else if(parent.getItem().compareTo(child.getItem())>0){
            if(!Objects.isNull(parent.getRightNode())){
                parent.setRightNode(child);
                child.setParent(parent);
                size++;
            }
            else{
                insert(parent.getRightNode(),child);
            }
        }
    }
    private void unlink(TreeNode currentNode,TreeNode newNode){
                if (currentNode==rootNode){
                    newNode.setLeftNode(currentNode.getLeftNode());
                    newNode.setRightNode(currentNode.getRightNode());
                    rootNode=newNode;
                }else if(currentNode.getParent().getRightNode()==currentNode)
                    currentNode.getParent().setRightNode(newNode);
                else
                    currentNode.getParent().setLeftNode(newNode);
    }
    private class TreeNode{
        private X item ;
        private TreeNode leftNode;
        private TreeNode rightNode;
        private TreeNode parent;

        public TreeNode(X item) {
            this.item = item;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }


        public TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }
    }
}
