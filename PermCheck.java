//https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
public class PermCheck {
    public static int solution(int[] A){
        if(A.length == 1 && A[0] != 1){
            return 0;
        }

        int arraySum = 0;
        int trueSum = A.length*(A.length+1);
        trueSum = (int) Math.ceil(trueSum/2);

        for(int i =0; i<A.length; i++){
            arraySum += A[i];
        }

        if(arraySum != trueSum){
            return 0;
        }

        //Check for duplicates in array
        int[] count = new int[A.length];
        for(int i = 0; i < A.length; i++){
            if(A[i] > A.length){
                return 0;
            }
            if(count[A[i]-1] == 1){
                return 0;
            }
            else{
                count[A[i]-1]++;
            }
        }
        return 1;
    }
}
