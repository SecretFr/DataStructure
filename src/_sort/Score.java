package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;


//성적이 낮은 순서로 학생 출력하기
/*
2
홍길동 95
이순신 77
*/
public class Score {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        System.out.println("KeySet()"+map.keySet());
        for(String key : map.keySet()){
            System.out.println(String.format("key: %s, value: %s", key, map.get(key)));
        }

        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Integer::compareTo);
        for(Integer value : valueList){
            System.out.print(value+" ");
        }
    }
}
