package chap98_homework.nc230404.clazz;

public class IntArrUtils {

    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int getMid(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i]; // 4
                    arr[i] = arr[j];// arr[i] = 1
                    arr[j] = tmp; //4
                }
            }
        }
        //123456678

        int mid = arr[(arr.length / 2 -1)];
        return mid;
    }
}
