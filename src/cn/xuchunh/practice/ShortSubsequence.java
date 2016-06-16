package cn.xuchunh.practice;

import java.util.Arrays;

/**
 * ����һ����������A�������һ���㷨�������Ҫ��������������ĳ��ȡ�
 * ����һ����������A�����Ĵ�Сn���뷵�����������ĳ��ȡ�
 * ����������
 * [1,5,3,4,2,6,7],7
 * ���أ�4
 * Created by XuChunH on 2016/4/10.
 */
public class ShortSubsequence {

    public static int findShortest(int[] A, int n) {
        // write code here
        int[] sorted = Arrays.copyOf(A, A.length);
        Arrays.sort(sorted);
        int distance = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i] != sorted[i]){
                for(int j = A.length - 1; j > i; j--){
                    if(A[j] != sorted[j]){
                        distance = j - i + 1;
                        return distance;
                    }
                }
            }

        }
        return distance;
    }

    public static void main(String[] args) {
        int[] data = {1,2,298276,264461,21251,171315,164437,199777,125199,303029,303030};
        System.out.println(findShortest(data, data.length));
    }

}
