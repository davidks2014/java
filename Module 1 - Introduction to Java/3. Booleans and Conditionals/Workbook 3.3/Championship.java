public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        int gryffindor = 100;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
          System.out.println("Gryffindor takes the house cup!");
        } else if (margin < 300 && margin >= 0) {
          System.out.println("In Second Place, Gryffindor!");
        } else if (margin < 0 && margin >= -100) {
          System.out.println("In Third Place, Gryffindor!");
        } else {
          System.out.println("In Fourth Place, Gryffindor!");
        }

    }
}
