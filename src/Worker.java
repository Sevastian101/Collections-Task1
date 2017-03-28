import java.util.ArrayList;

/**
 * Created by sodobescu on 3/27/2017.
 */
public class Worker {
    private String firstName;
    private String lastName;
    private int age;
    private boolean readyForTrip;
    private ArrayList<String> countryToGo = new ArrayList();


    public Worker(String[] countryToGo) {
        this.firstName = "James";
        this.readyForTrip = true;
        this.age = 22;
        this.lastName = "Martins";
        for (int i = 0; i < countryToGo.length; i++) {
            this.countryToGo.add(countryToGo[i]);
        }
    }

    public Worker() {
        this.firstName = "Sevastian";
        this.readyForTrip = true;
        this.age = 22;
        this.lastName = "Odobescu";

        this.countryToGo.add("Russia");
        this.countryToGo.add("Canada");
        this.countryToGo.add("China");
        this.countryToGo.add("United States");
        this.countryToGo.add("Brazil");
        this.countryToGo.add("Australia");
        this.countryToGo.add("India");
        this.countryToGo.add("Argentina");
        this.countryToGo.add("Kazakhstan");
        this.countryToGo.add("Sudan");
    }

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.readyForTrip = true;
        this.age = 22;
        this.lastName = lastName;

        this.countryToGo.add("Russia");
        this.countryToGo.add("Canada");
        this.countryToGo.add("China");
        this.countryToGo.add("United States");
        this.countryToGo.add("Brazil");
        this.countryToGo.add("Australia");
        this.countryToGo.add("India");
        this.countryToGo.add("Argentina");
        this.countryToGo.add("Kazakhstan");
        this.countryToGo.add("Sudan");
    }

    public Worker(Worker worker) {
        this.firstName = worker.firstName;
        this.countryToGo.addAll(worker.countryToGo);
        this.readyForTrip = worker.readyForTrip;
        this.age = worker.age;
        this.lastName = worker.lastName;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEqual = false;

        if (object != null && object instanceof Worker) {
            isEqual = (this.getFirstName() == ((Worker) object).getFirstName()) && (this.getLastName() == ((Worker) object).getLastName());
        }

        return isEqual;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isReadyForTrip() {
        return readyForTrip;
    }

    public void setReadyForTrip(boolean readyForTrip) {
        this.readyForTrip = readyForTrip;
    }

    public ArrayList<String> getCountryToGo() {
        return countryToGo;
    }

    public void setCountryToGo(ArrayList<String> countryToGo) {
        this.countryToGo = countryToGo;
    }

    public boolean workerCanVisit(String country) {

        if (countryToGo.contains(country)) return true;
        else return false;
    }

    @Override
    public String toString() {

        return this.firstName+" "+this.lastName;
    }
}
