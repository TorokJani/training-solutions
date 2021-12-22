package collectionsccomp;

public class Trainer implements Comparable<Trainer> {
    public String name;
    public int salary;

    public Trainer(String name, int salary){
        this.name= name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Trainer o) {
        return this.name.compareTo(o.name);
//        return this.salary-o.salary;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
