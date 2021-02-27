package pa.lab2.compulsory;

import pa.lab2.compulsory.classes.Destination;
import pa.lab2.compulsory.classes.Problem;
import pa.lab2.compulsory.classes.Source;

public class Main {
    public static void main(String[] args) {
        //Sources
        Source S1 = new Source("S1", Source.SourceType.FACTORY, 10);
        Source S2 = new Source("S2", Source.SourceType.WAREHOUSE, 35);
        Source S3 = new Source("S3", Source.SourceType.WAREHOUSE, 25);

        //Destinations
        Destination D1 = new Destination("D1", 20);
        Destination D2 = new Destination("D2", 25);
        Destination D3 = new Destination("D3", 25);

        int[][] costMatrix={
                {2,3,1},
                {5,4,8},
                {5,6,8}
        };

        //Creating a Problem P using the constructor
        Problem P = new Problem(new Source[]{S1,S2,S3}, new Destination[]{D1,D2,D3}, costMatrix);
        System.out.println(P);
    }
}
