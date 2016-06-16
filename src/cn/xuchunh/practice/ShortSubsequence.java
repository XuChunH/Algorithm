package cn.xuchunh.practice;

import java.util.Arrays;

/**
 * 对于一个无序数组A，请设计一个算法，求出需要排序的最短子数组的长度。
 * 给定一个整数数组A及它的大小n，请返回最短子数组的长度。
 * 测试样例：
 * [1,5,3,4,2,6,7],7
 * 返回：4
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
