import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String val;

    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        observerList.forEach(Observer::update);
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
        notifyAllObserver();
    }
}
