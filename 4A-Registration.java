import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer>
            h = new HashMap<String, Integer>();
        while(n-->0){
            
            
            String str=sc.nextLine();
            if(h.get(str)==null){
                System.out.println("OK");
                h.put(str,1);
                
                
            }
            else{
                System.out.println(str+""+h.get(str));
                h.put(str,h.get(str)+1);
            }
        }
    }
}