package SingleTonPattern;

/**
 * Created by YooHyeongJu on 2017-05-17.
 */
public enum DoubleTon {
    SINGLE("1번 인스턴스"), DOUBLE("2번 인스턴스");
    public static DoubleTon getInstance() {
        num = (num+1) %2;
        DoubleTon result = null;
        if(num == 0) {
            result = SINGLE;
        } else if(num == 1) {
            result = DOUBLE;
        } else {
            throw new RuntimeException(String.format("[에러] 예상못한 TOGGLE 변수 : %d", num));
        }
        return result;
    }

    private static int num = 0;
    private String toStringMessage;
    DoubleTon(String toStringMeesage) {
        this.toStringMessage =toStringMessage;
    }

}
