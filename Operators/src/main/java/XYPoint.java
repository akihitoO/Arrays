/**
 *
 */
public class XYPoint {

    public static String main(int x, int y) {

        String c = "";
        if(x<0 & y<0)
            {c = "-X-Y";
            System.out.println("Point is in quadrant -X-Y");}

        if(x>0 & y>0)
            {c = "XY";
            System.out.println("Point is in quadrant XY");}

        if(x<0 & y>0)
            {c = "-XY";
            System.out.println("Point is in quadrant -XY");}

        if(x>0 & y<0)
            {c = "X-Y";
             System.out.println("Point is in quadrant X-Y");}

        if(x==0)
            {c = "X";
             System.out.println("Point is on axis X");}

        if(y==0)
            {c = "Y";
            System.out.println("Point is on axis Y");}

        if(y==0 & x==0)
           {c = "0:0";
            System.out.println("Point is in 0:0");}

        return c;
    }

    }
