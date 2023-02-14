import java.util.ArrayList;

public class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        // 소문자열 변환
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 두 집합 리스트
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // 공집합과 합집합 리스트
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();

        // str1 문자열 두 문자씩 끊고 공백과 특수문자가 들어간 문자열 버리기
        for (int i = 0; i < str1.length()-1; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(i+1);

            if((ch1 >= 'a' && ch1 <= 'z') && (ch2 >= 'a' && ch2 <= 'z')) {
                list1.add(String.valueOf(ch1) + String.valueOf(ch2));
            }
        }

        // str2 문자열 두 문자씩 끊고 공백과 특수문자가 들어간 문자열 버리기
        for (int i = 0; i < str2.length()-1; i++) {
            char ch1 = str2.charAt(i);
            char ch2 = str2.charAt(i+1);

            if((ch1 >= 'a' && ch1 <= 'z') && (ch2 >= 'a' && ch2 <= 'z')) {
                list2.add(String.valueOf(ch1) + String.valueOf(ch2));
            }
        }

        // 교집합과 합집합
        for(String s : list1) {
            if(list2.remove(s)) {
                intersection.add(s);
            }

            union.add(s);
        }
        // h와 남아있는 list2 합집합
        union.addAll(list2);

        // 자카드 유사도 구하기
        double temp = (double) intersection.size() / (double) union.size();

        temp = temp * 65536;

        // 합집합이 공집합이면 자카드 유사도가 1이므로
        if (union.isEmpty()) {
            return 65536;
        }

        answer = (int) temp;

        return answer;
    }
}
