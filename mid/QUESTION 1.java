import java.util.Arrays;
import java.util.Scanner;
    public class Main {


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        System.out.println("enter the array");
        int array []=new int[size];
   for (int i=0;i<size;i++) {
       array[i]=sc.nextInt();
   }
  System.out.println(Linear_Search(array, 6));



}

        public static int Linear_Search(int list[], int key)
    {
    int index=0;
    int found=0;

        do{
    if(key==list[index])
     found++;

    else
     index++;
    }while(found==0 && index< list.length);
    if(found==0)
     index=-1;
    return found;
    }
    }











