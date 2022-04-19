package S107N1Ex1;

public class F2FWorker extends Worker {
    private int km; //Se paga a 1€ el km


    public F2FWorker(String name, String surname, int nHours,int km) {
        super(name, surname, nHours);
        this.km = km;

    }

    @Override
    public int salary() {

        return super.salary() + (this.km*30);//nºkms x 30 días mes
    }
}



