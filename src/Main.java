import cn.xuchunh.practice.ShortSubsequence;

/**
 * Created by XuChunH on 2016/4/10.
 */
public class Main {

    public static void main(String[] args) {
        int[] data = {1,2,298276,264461,21251,171315,164437,199777,125199,303029,303030};
        System.out.println(new ShortSubsequence().findShortest(data, data.length));
    }

}
