// public class Example{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }
public class Example{
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int n=arr.length;
        int max=arr[n-1];
        System.out.println(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}