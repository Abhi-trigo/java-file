import java.util.Scanner;
import java.util.Collection;
import java.util.HashMap;
public class Isogramstring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tests,flag=0;
        tests=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<tests;i++){
            String s=sc.nextLine();
            flag=checkString(s);
        
        System.out.println(flag);      
        }
    }

    public static int checkString(String temp){
        HashMap<Character,Integer> map=new HashMap();
        for(int j=0;j<temp.length();j++){
            char a=temp.charAt(j);
            if(map.containsKey(a)==true){
                int vtemp=map.get(a);
                map.put(a, vtemp+1);
            }
            else{
                map.put(a,1);
            }
        }
        Collection<Integer>values=map.values();
        int flag=1;
        for(Integer value:values){
            if(value>1 || value<1){
                flag=0;
                break;
            }
        }
        return flag;
    }

}

