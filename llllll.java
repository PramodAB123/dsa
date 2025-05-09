public class llllll {
    int data;
    llllll next;
    
    public llllll(int data) {
        this.data = data;
        this.next = null;
    }
    public static llllll insertAtFront(llllll head, int data){
        llllll newNode = new llllll(data);
        if(head==null) return newNode;
        newNode.next=head;
        head=newNode;
        return head;
    }
    
    public static llllll insertAtEnd(llllll head, int data) {
        llllll newNode = new llllll(data);
        
        if(head == null) {
            return newNode;
        }
        
        llllll current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    
    public static void main(String[] args) {
        llllll head = null;
        
        // Insert nodes at the end
        head = insertAtEnd(head, 1);
        
        head = insertAtEnd(head, 2);
        head = insertAtFront(head, 9);
        head = insertAtEnd(head, 3);
        
        // Print the linked list
        llllll current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
