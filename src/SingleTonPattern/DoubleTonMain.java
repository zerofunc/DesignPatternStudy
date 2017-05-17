package SingleTonPattern;

/**
 * Created by YooHyeongJu on 2017-05-17.
 */
public class DoubleTonMain {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; ++i) {
            new Thread(() -> {
                String message = DoubleTon.getInstance().toString();
                System.out.println(message);
            }).
                    start();
        }
    }
}
