public class Observer2 extends Observer {

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Observer2 收到了更新," + subject.getVal());
    }

}