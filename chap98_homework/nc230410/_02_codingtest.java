package chap98_homework.nc230410;

public class _02_codingtest {
    public static void main(String[] args) {
        //가장 중복되는 수 구하기
        int[] a = new int[10];
        int[] cnt = new int[10];
        int max = 0;
        int max_ = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*10)+1;
            cnt[i] = 0;
            System.out.print(a[i]+" ");
        }
        System.out.println("");


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] == a[j]){
                    cnt[i]++;
                }
            }
            if(max < cnt[i]){
                max = cnt[i];
                max_ = a[i];
            }
        }
        System.out.println(max_);
    }
}
