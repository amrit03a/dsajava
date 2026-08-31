package array;
import java.util.*;
public class strobogrammatic {
    public static boolean stro(String num){
        Map<Character,Character> map=new HashMap<>();
        map.put('6', '9');
        map.put('9', '6');   
        map.put('0', '0'); 
        map.put('1', '1');
        map.put('8', '8');
        int l=0;
        int r=num.length()-1;
        while(l<=r){
            if(!map.containsKey(num.charAt(l))){
                return false;
            }
            if(map.get(num.charAt(l))!=num.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        System.out.println(stro(n));
    }
}
