import javax.sound.midi.SysexMessage;
import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

//        for(int i=0; i<size; i++){
//            System.out.println(numbers[i]);
//        }

        int k = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == k){
                System.out.println(i);
            }
            
        }


    }
}
