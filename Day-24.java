public static int getFirst(Node head) {
      if (head == null) {
       return -1;
      } else {
        return head.data;
      }
    }
    public static void removeFirst(Node head) {
      if (head==null) {
        return;
      } else if (head.next==null) {
        head = null;
      } else {
        head = head.next;
      }
    }
    public static Node removeDuplicates(Node head) {
   
    Node curr = head; 
  
        
        while (curr != null) { 
             Node temp = curr; 
            
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            
            curr.next = temp; 
            curr = curr.next; 
        } 
        return head;
    }

