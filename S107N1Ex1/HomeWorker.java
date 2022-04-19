package S107N1Ex1;

public class HomeWorker extends Worker{

    private int nHours;


    public HomeWorker(String name, String surname, int nHours) {
        super(name, surname,nHours);
    }

    @Override
    public int salary() {
        return super.salary();
    }
}
