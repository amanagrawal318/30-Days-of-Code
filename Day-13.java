class MyBook extends Book{
      int price;
      MyBook(String s,String A,int p){
          super(s,A);
          this.price=p;
      }
      void display(){
          System.out.println("Title: "+title);
          System.out.println("Author: "+author);
          System.out.println("Price: "+price);
      }
  }
