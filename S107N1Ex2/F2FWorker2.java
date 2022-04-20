package S107N1Ex2;

public class F2FWorker2 extends Worker2 {
    private int km; //Se paga a 1€ el km


    public F2FWorker2(String name, String surname, int nHours, int km) {
        super(name, surname, nHours);
        this.km = km;
    }

    @Override
    public int salary() {

        return super.salary() + (this.km*30);//nºkms x 30 días mes
    }
}


