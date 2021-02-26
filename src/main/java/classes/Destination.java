package classes;

public class Destination {
    private String name;
    private int demand;

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", demand=" + demand +
                '}';
    }

    //Constructor

    public Destination(String name, int demand) {
        this.name = name;
        this.demand = demand;
    }

    //Getters

    public String getName() {
        return name;
    }

    public int getDemand() {
        return demand;
    }
    //Setters

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public void setName(String name) {
        this.name = name;
    }

}
