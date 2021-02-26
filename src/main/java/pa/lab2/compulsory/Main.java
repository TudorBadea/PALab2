package pa.lab2.compulsory;

import classes.Destination;
import classes.Problem;
import classes.Source;

import java.util.zip.DeflaterInputStream;

public class Main {
    public static void main(String[] args) {
        Source S1 = new Source("S1", Source.SourceType.FACTORY, 10);
        Source S2 = new Source("S2", Source.SourceType.WAREHOUSE, 35);
        Source S3 = new Source("S3", Source.SourceType.WAREHOUSE, 25);

        Destination D1 = new Destination("D1", 20);
        Destination D2 = new Destination("D2", 25);
        Destination D3 = new Destination("D3", 25);

        Problem P = new Problem();
        System.out.println(P);

    }
}
