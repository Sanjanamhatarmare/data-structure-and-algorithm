import java.util.*;
public class linearsearchprogram{
    public static int linearsearchprogram(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=12;
        int index=linearsearchprogram(number,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index:"+index);
        }
    }
}