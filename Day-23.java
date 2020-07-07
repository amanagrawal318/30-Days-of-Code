static void levelOrder(Node root){
      //Write your code here
      Queue<Node> qu=new LinkedList<>();
      qu.add(root);
      while(qu.size()>0){
          Node cq=qu.remove();
          System.out.print(cq.data+" ");
          if(cq.left!=null){
              qu.add(cq.left);
          }
          if(cq.right!=null){
              qu.add(cq.right);
          }
      }
      
    }

