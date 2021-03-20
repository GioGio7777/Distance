public class main {

    void calculateMinkowski(double x[], double y[], double[] P1, double[] P2, double R) {
        double result = 0;
        double plus = 0;
        double pls = 0;

        for (int i = 0; i < x.length; i++) {
            plus += (x[i] - y[i]);


            Math.pow(plus, R);

        }
        for (int i = 0; i < P1.length; i++) {
            pls += (P1[i] - P2[i]);
            Math.pow(pls, R);
        }


        result = Math.pow(plus, 1 / R);
        double rslt = Math.pow(pls, 1 / R);

        System.out.println(result);
        System.out.println(rslt);
    }

    void calculateMahalonobis(double x[], double y[], double[] P1, double[] P2) {
        double result = 0;
        double[] mahalonobis = new double[x.length];
        int meanx = 0;
        int meany = 0;

        for (int i = 0; i < x.length; i++) {

            meanx += x[i];
            meany += y[i];


        }

        meanx /= x.length;
        meany /= y.length;


        int varx = 0;
        int vary = 0;

        for (int i = 0; i < x.length; i++) {


            varx += Math.pow(x[i] - meanx, 2);
            vary += Math.pow(y[i] - meany, 2);


        }
        varx /= (x.length - 1);
        vary /= (x.length - 1);

        double coveriancex = 0;
        double coveriancey = 0;

        for (int i = 0; i < x.length; i++) {
            coveriancex += x[i] - meanx;
            coveriancey += y[i] - meany;

        }
        coveriancex /= x.length;
        coveriancey /= y.length;

        double xy1 = P1[0] - P2[0];
        double xy2 = P1[1] - P2[1];

        System.out.println("X:" + (xy1 * coveriancex));
        System.out.println("Y:" + (xy2 * coveriancey));


    }

    public static void main(String[] args) {

    }
}
