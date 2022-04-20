package S107N1Ex2;

public class HomeWorker2 extends Worker2 {
    private int nHours;


    public HomeWorker2(String name, String surname, int nHours) {
        super(name, surname,nHours);
    }

    @Deprecated
    public int salary() {
        return super.salary();
    }
}
