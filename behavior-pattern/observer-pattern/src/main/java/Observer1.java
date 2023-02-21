public class Observer1 extends Observer {

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Observer1 收到了更新," + subject.getVal());
    }

}