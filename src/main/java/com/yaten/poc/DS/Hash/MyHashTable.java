package com.yaten.poc.DS.Hash;

import java.util.Objects;

public class MyHashTable<K,V> {
    private HashEntry[] data;
    private int tableSize;
    private int entryCounter;
    public MyHashTable(int tableSize) {
        this.tableSize = tableSize;
        data=new HashEntry[tableSize];
        entryCounter=0;
    }

    public void put(K key,V value){
        data[calculateHash(key)]=new HashEntry<>(key,value);
        entryCounter++;
    }
    public V get(K key){
        int hash=calculateHash(key);
        if(Objects.isNull(data[hash]))
            return null;
        return (V)data[hash].getValue();
    }

    public void delete(K key){

    }
    private int calculateHash(K key){
        int hash=key.hashCode()% this.tableSize;
        //to handle the collision
        while(data[hash]!=null && !data[hash].getKey().equals(key)){
            hash=(hash+1)% this.tableSize;
        }
        return hash;
    }
    public int size(){
        return entryCounter;
    }






    private class HashEntry<K,V>{
    private K key;
    private V value;

        public HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
