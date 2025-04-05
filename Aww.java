import java.util.*;
public class Aww {
    public static void main(String [] args){
    int d;
    int n;
    int []a;
    int du=0;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Number of elements in array");
    
    n = s.nextInt();
    a = new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter the " + i+1 + " index element :");
        a[i]=s.nextInt();
    }
    Arrays.sort(a);


    for(int i=0;i<n;i++){
        if(i>0&&a[i-1]==a[i]){
            if(du==0){
            du = a[i];}
            du= Math.max(du,a[i]);
             
        }
    }System.out.println("The last duplicate in an array is" + du);
        
s.close();
}
}
