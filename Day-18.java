public class Solution {
    // Write your code here.
    Stack<Character> st=new Stack<>();
    Queue<Character> qu=new LinkedList<>();
    public void pushCharacter(char ch){
     st.push(ch);
    }
    public void enqueueCharacter(char ch){
      qu.add(ch);
    }
    public char popCharacter(){
      return st.pop();
    }
    public char dequeueCharacter(){
      return qu.remove();
    }

