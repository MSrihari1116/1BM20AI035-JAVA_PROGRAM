import java.util.Scanner;
class Excephand{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array:");
      int n = sc.nextInt();
      int [] arr = new int[n];
      System.out.println("Enter element of array:");

      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter the index to print:");
      int c = sc.nextInt();
      try{
         System.out.println("element at index is:"+arr[c]);

      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
      }
   }
}
