class ArrayPrac {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        //largest number
        int arr[] = {5,8,2,10,3};
        int max= arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println("Largest number:"+ max);
        //smallest number
        int num[] = {7,3,9,1,6};
        int min = num[0];
        for(int i = 1;i<num.length;i++){
            if(num[i]<min)
            min=num[i];
        }
        System.out.println("Smallest number:"+ min);
    }
    
}
