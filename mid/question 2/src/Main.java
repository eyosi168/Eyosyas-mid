//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

}
 class Stack {
        public int[]arr;
        public int top;
        public Stack (int size) {
            arr = new int[size];
            top = -1;
        }
         public void push ( int data){
                 if(top == arr.length-1){
                     System.out.println("stack over flow");
                 else {
                     arr[++top]=data;
                     }
                 }
         public int pop(){
                 if(top==-1){
                     System.out.println("stack over flow");
                 }
             }




        }







}