public static int getHeight(Node root){
      //Write your code here
      if(root==null)
      {
          return 0;
      }
      int myheight=-1;
      if(root.left!=null)
      {
          myheight=getHeight(root.left);
      }
      if(root.right!=null)
      {
         myheight=Math.max(myheight,getHeight(root.right));
      }
      return myheight+1;
    }

