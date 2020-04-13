package ibmponderthis;


import java.util.Arrays;

public class April2020 {

    public static void main(String[] args) {
        int[][] topo = {
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0}
        };
        double[] d0 = {100, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {
//            double[] d1 = Arrays.copyOf(d0, d0.length);
            double[] d1 = new double[5];
            d1[0] = 100;
            for (int cityId=1; cityId<d1.length; cityId++){
                for (int vert=0; vert<d1.length; vert++){
                    double v = topo[cityId][vert] * d0[vert]*0.1;
                    d1[cityId] += v;
                    d1[cityId] = Math.min(100, d1[cityId]);
                }
            }
            d0 = d1;
            System.out.println(Arrays.toString(d0));
        }

    }

}

