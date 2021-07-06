package _algorithm._greedy;

public class ChangeMoney {
    public static void main(String[] args){
        int[] arr = {500, 100, 50, 10};
        int cnt = 0;
        int n = 1260;
    
        for(int i=0; i<arr.length; i++){
            int coin = arr[i];
            cnt = cnt + (n/coin);
            n = n % coin;
        }

        System.out.println(cnt);

    }
}
