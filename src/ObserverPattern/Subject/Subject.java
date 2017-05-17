package ObserverPattern.Subject;

import ObserverPattern.Observer.Observer;

/**
 * Created by yhj0429 on 2016-07-27.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // 주제 객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메서드
    public void notifyObservers();
}
