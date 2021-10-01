import java.io.*;
import java.util.*;  
public class P3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int v = x;
        int c = 0;
        int s = 0;
        while (v > 0){
            c = c + 1;
            s += v % 10;
            v = v / 10;
            

}
        if (c == 3){
             System.out.println(s);
}    
        else {
             System.out.println(x);
           
}
}
} 