package SingleTonPattern;

/**
 * Created by YooHyeongJu on 2017-05-17.
 */
public class MultitonMain {
    public static void main(String[] args) {
        Multiton.setInstanceCount(5);
        for (int i = 0; i < 100000; ++i) {
            new Thread(() -> {
                String message = Multiton.getInstance().toString();
                System.out.println(message);
            }).
                    start();
        }
    }
}
