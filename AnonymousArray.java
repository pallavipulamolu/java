public class AnonymousArray {
    public static void main(String args[]){
        printArray(new int[]{10, 20, 30, 40});
    }
    static void printArray(int arr[]){
        System.out.println("The elements of Anonymous array are: ");
        for(int i=0; i<4; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
