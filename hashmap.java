import java.util.LinkedList;

public class hashmap {
    static class myhashmap< K , V >{
        public static final int Default_Capacity=4;
        public static final float load_factor=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private LinkedList<Node>[] buckets;
        private int n=0;
        public void initbuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunct(K key){
            int p=key.hashCode();
            return Math.abs(p)%buckets.length;
        }
        public myhashmap(){
            initbuckets(Default_Capacity);
        }
        private int serachinbucket(LinkedList<Node> ll, K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key.equals(key)){  // Fixed: Use equals() instead of == for object comparison
                    return i;
                }
            }
            return -1;
        }
        
        public int size(){ //return the number of enteries
            return n;
        }

        public void put(K key, V value){
            int bi=HashFunct(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei= serachinbucket(currBucket, key);
            if(ei == -1){
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            }
            else{
                Node currNode=currBucket.get(ei);  // Fixed: Use ei instead of bi
                currNode.value=value;
            }
        }
        public V get(K key){
            int bi = HashFunct(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei = serachinbucket(currBucket, key);
            if(ei == -1){
                return null;
            }
            else{
                Node currNode=currBucket.get(ei);
                return currNode.value;
            }
        }
        
        public V remove(K key){
            int bi=HashFunct(key);  // Fixed: Use HashFunct instead of hashCode
            LinkedList<Node> currBucket= buckets[bi];
            int ei=serachinbucket(currBucket, key);
            if(ei == -1){
                return null;
            }
            else{
                Node currentNode=currBucket.get(ei);
                V val=currentNode.value;
                currBucket.remove(ei);
                n--;  // Fixed: Move n-- before return
                return val;
            }
        }
    }
    public static void main(String[] args) {
        myhashmap<String , Integer> mp =new myhashmap<>();
        System.out.println("welcome");
        mp.put("hello", 12);
        mp.put("a", 12);
        System.out.println(mp.size());
        System.out.println(mp.get("a"));
    }
}
