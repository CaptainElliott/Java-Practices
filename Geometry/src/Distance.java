/**
 * Created by Elliott2 on 03-May-16.
 */
public class Distance {

    public static void main(String[] args) {
        System.out.println(inRange(10, new Point(10,0,0), new Point(0,0,0))); // True
        System.out.println(inRange(10, new Point(11,0,0), new Point(0,0,0))); // False
        System.out.println(inRange(10, new Point(14,4,8), new Point(6,8,12))); // True
    }

    public static boolean inRange(int range, Point point1, Point point2) {
        return (Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2) + Math.pow(point2.getZ() - point1.getZ(), 2)) <= Math.pow(range, 2);
    }

}
