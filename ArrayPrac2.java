import java.util.Arrays;
class ArrayPrac2 {
    public static void main(String[] args) {
     //even and odd
     int arr[] = {5,8,11,20,15};
     System.out.println("Even numbers:");
     for (int num:arr){
        if(num%2==0)
        System.out.print(num+"");
     }
     System.out.println("Odd numbers");
     for(int num:arr){
        if(num%2!=0)
        System.out.println(num+"");
     }
     //Ascending order
     int ar[] = {5,1,4,2,3};
     Arrays.sort (ar);

     System.out.println("sorted arrays:");
     for(int num :ar){
        System.out.print(num+"");
     }

   
    }
    
    
}
