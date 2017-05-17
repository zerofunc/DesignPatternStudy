package SingleTonPattern;

import java.util.ArrayList;

/**
 * Created by YooHyeongJu on 2017-05-17.
 */
public class Multiton {
    private static int num = 0;
    private static ArrayList<Multiton> list ;

    // 외부에서 인스턴스를 생성 못하도록 접근제한
    private Multiton(String toStringMessage) {
        this.toStringMessage = toStringMessage;
    }

    public static void setInstanceCount(int instanceCount) {
        list = new ArrayList<Multiton>();
        for (int i = 0; i < instanceCount; ++i) {
            list.add(new Multiton(i + 1+"번 인스턴스"));
        }
    }

    private String toStringMessage;
    public static Multiton getInstance() {
        num = (num +1) % list.size();
        return list.get(num);
    }

    @Override
    public String toString() {
        return toStringMessage;
    }
}
