
public class Stack {
    public int[]arr;
    public int top;
    public Stack (int size) {
        arr = new int[size];
        top = -1;
    }
    public void push ( int data){
        if(top == arr.length-1) {
            System.out.println("stack over flow");
        }else{
                arr[++top]=data;
            }
        }
        public int pop(){
            if(top==-1){
                System.out.println("stack over flow")
                  return-1;
            }
            else{
                return arr[top--];
            }
        }




    }



