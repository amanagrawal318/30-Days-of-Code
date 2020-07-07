public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp=new Node(data);
        if(head==null){
            head=new Node(data);
            return head;
        }
        Node nn=head;
        while(nn.next!=null){
            nn=nn.next;
        }
        nn.next=temp;
       return head;
    }
