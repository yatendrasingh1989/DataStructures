package com.yaten.poc;

import com.yaten.poc.DoublyLinkedList.NewDLLNode.DLLNode;

public class DoublyLinkedList {
	NewDLLNode head;
	
	NewDLLNode tail;
	
	
	public static class NewDLLNode{
	
	private DLLNode next;
	private DLLNode pre;
	private String data;
	
	
	
	
	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	public DLLNode getPre() {
		return pre;
	}

	public void setPre(DLLNode pre) {
		this.pre = pre;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static class DLLNode{
		private final long adress;
		public DLLNode(Integer nodeAdress){
			adress=nodeAdress.intValue();
		}
		public long getAdress() {
			return adress;
		}
		
	}
	
	}
public void add (String data, Integer next, Integer pre){
	System.out.println("Inserting value :"+data+" @Next Adress :"+next+" @Pre Adress:"+pre);
  NewDLLNode dllNode = new NewDLLNode();
  dllNode.data=data;
  dllNode.next=new DLLNode(next);
  dllNode.pre=new DLLNode(pre);
  
  if(null == head){
	  head=dllNode;
	  head.pre=null;
	 // head.next=tail.pre;
  }
  else{
	  head.next=new DLLNode(pre);
	  tail=dllNode;
	  tail.next=null;
  }
}

public static void main(String args[]){
	DoublyLinkedList dList = new DoublyLinkedList();
	dList.add("12",Integer.MIN_VALUE, null);
	dList.add("13",Integer.MIN_VALUE, null);
}
}
