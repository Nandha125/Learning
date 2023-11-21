package DataStructures.HashTable;

import java.util.ArrayList;

public class HashTable {

    public static class HashEntry{
        String key;
        int value;
        HashEntry next;

        HashEntry(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private ArrayList<HashEntry> buckets;
    private int slots;
    private int size;

    HashTable(){
        buckets = new ArrayList<>();
        slots = 10;
        size = 0;
        for(int i = 0; i<slots; i++){
            buckets.add(null);
        }
    }

    // getting index from HashFunction ==> Arithmetic Modular
    private int getIndex(String key){
        int hashCode = key.hashCode();
        int index = hashCode % slots;
        if(index < 0) index = (index + slots) % slots;
        return index;
    }

    private int get(String key){
        int index = getIndex(key);
        HashEntry head = buckets.get(index);
        while (head != null){
            if(head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return -1; // key is not found return -1
    }

    public void insert(String key, int value){
        int index = getIndex(key);
        HashEntry head = buckets.get(index);
        while( head != null){
             if(head.key.equals(key)){
                 head.value = value;
             }
             head = head.next;
        }
        size++;
        head = buckets.get(index);
        HashEntry newSlot = new HashEntry(key, value);
        newSlot.next = head;
        buckets.set(index,newSlot);

        if((1.0*size)/slots >= 0.6){
            ArrayList<HashEntry> temp = buckets;
            buckets = new ArrayList<>();
            slots = 2 * slots;
            for(int i = 0; i<slots; i++){
                buckets.add(null);
            }
            for(HashEntry node: temp){
                while(node != null){
                    insert(node.key, node.value);
                    node = node.next;
                }
            }
        }
    }

    public int delete(String key){
        int index = getIndex(key);
        HashEntry head = buckets.get(index);
        HashEntry prev = null;
        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;
        }
        if(head == null) return -1;
        if(prev!=null)
            prev.next = head.next;
        else
            buckets.set(index, head.next);
        return head.value;
    }




    public static void main(String[] args){

    }

}
