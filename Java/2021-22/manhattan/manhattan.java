import java.util.Scanner;

public class manhattan
{
    public static void main (String [] args)
    {
        Scanner  in = new Scanner(System.in);

        int iterations = Integer.parseInt(in.nextLine());
        int x1, y1, x2, y2;

        for (int i = 0; i < iterations; i++)
        {
            x1 = in.nextInt();
            StringBuilder points  = new StringBuilder();
            points.append(in.nextLine());

            y1 = Integer.parseInt(points.substring(1, points.indexOf(" ")));
            points.replace(y1.toString(), "");
            x2 = Integer.parseInt(points.substring(1, points.indexOf("")));
            points.replace(x2.toString(), "");
            y2 = Integer.parseInt(points.substring(1));

            if (x1 == x2 || y1 == y2)
                System.out.println("Dr. Manhattan wins again!");
            else
                System.out.println("Euclid is too fast!");
        }

        in.close();
    }
}