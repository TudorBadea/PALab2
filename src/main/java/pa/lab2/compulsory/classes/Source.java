package pa.lab2.compulsory.classes;

public class Source {
    private String name;
    private SourceType type;
    private int capacity;

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                '}';
    }

    public enum SourceType {
        WAREHOUSE, FACTORY;
    }

    //Constructor

    public Source(String name, SourceType type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    //Getters

    public String getName() {
        return name;
    }

    public SourceType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
