package classes;

import java.util.Arrays;

public class Problem {
    private int[] demand = {20, 25, 25};
    private int[] supply = {10, 35, 25};
    private int[][] costMatrix = new int[][]{
            {2, 3, 1},
            {5, 4, 8},
            {5, 6, 8}
    };

    @Override
    public String toString() {
        return "Problem{" +
                "demand=" + Arrays.toString(demand) +
                ", supply=" + Arrays.toString(supply) +
                ", costMatrix=" + Arrays.deepToString(costMatrix) +
                '}';
    }
}
