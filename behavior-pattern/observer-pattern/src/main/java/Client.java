public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new Observer1(subject);
        new Observer2(subject);

        subject.setVal("更新值1");
        subject.setVal("更新值2");
    }

}
