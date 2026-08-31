package treegraph;
import java.util.*;

/*class student implements Comparable<student>{
    int roll;
    int marks;
    String name;
    student(int roll,int marks,String name){
        this.roll=roll;
        this.marks=marks;
        this.name=name;
    }
    @Override
    public int compareTo(student that){
        if(that.marks==this.marks){
            if(that.roll==that.roll){
                return this.name.compareTo(that.name);
            }
            return this.roll-that.roll;
        }
        return that.marks-this.marks;
    }
    public String toString(){
        return "Student "+this.name;
    }
}
public class TreeMapcode {
    public static void main(String[] args){
        TreeMap<student,Integer> tmap=new TreeMap<>();
        tmap.put(new student(4,50,"aman"),10);
        tmap.put(new student(3, 40, "rahul"),11);
        tmap.put(new student(10, 50, "kahul"),7);
        tmap.put(new student(1, 10, "zahul"),9);

        System.out.println(tmap);
    }
}*/

//leetcode question  -981

class TreeMapcode{
    HashMap<String,TreeMap<Integer,String>> map;
    TreeMapcode(){
        map= new HashMap<>();
    }
    public void set(String key,String vaue,int timestamp){
        if(!map.containsKey(key)){
            map.put(key,new TreeMap<>());
        }
        map.get(key).put(timestamp,vaue);
    }
    public String get(String key,int timestamp){
        if(!map.containsKey(key)){
            return "";
        }
        Integer time=map.get(key).floorKey(timestamp);
        if(time==null){
            return "";
        }
        return map.get(key).get(time);
    }
}


