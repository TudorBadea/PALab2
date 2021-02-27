package pa.lab2.compulsory.classes;

import java.util.Arrays;

public class Problem {
    private Source[] source;
    private Destination[] destination;
    private int[][] costMatrix;

    @Override
    public String toString() {
        return "Problem{" + '\n' +
                '\t' + "source=" + Arrays.toString(source) + '\n' +
                '\t' + "destination=" + Arrays.toString(destination) + '\n' +
                '\t' + "costMatrix=" + Arrays.deepToString(costMatrix) + '\n' +
                '}';
    }//used deepToString to print each element of costMatrix, not just the line ID.

    //Constructor

    public Problem(Source[] source, Destination[] destination, int[][] costMatrix) {
        this.source = source;
        this.destination = destination;
        this.costMatrix = costMatrix;
    }

    //Getters

    public Source[] getSource() {
        return source;
    }

    public Destination[] getDestination() {
        return destination;
    }

    public int[][] getCostMatrix() {
        return costMatrix;
    }

    //Setters

    public void setSource(Source[] source) {
        this.source = source;
    }

    public void setDestination(Destination[] destination) {
        this.destination = destination;
    }

    public void setCostMatrix(int[][] costMatrix) {
        this.costMatrix = costMatrix;
    }
}
