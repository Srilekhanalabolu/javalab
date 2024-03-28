public class comarray{
         int [] arr3={4,8,9,6};
           public static void main(String[] args){
             int[] arr1={4,7,3,9,2};
             int[] arr2={5,6,4,3,8,9,7,4};
             System.out.println("the common elemnts");
             for (int i=0;i<arr1.length;i++){
               for (int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                       System.out.println(arr1[i]);
                     }
                   }
                 }
              }
           }

          