package banana;

import java.util.Scanner;

public class banana
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);

        int pancakes, slices;
        pancakes = Integer.parseInt(in.nextLine());

        for (int i = 0; i < pancakes; i++)
        {
            slices = Integer.parseInt(in.nextLine());

            int[][] coordinates = new int[2][slices];
            int[][] targets = new int[2][slices];

            for (int x = 0; x < slices; x++)
            {
                coordinates[0][x] = in.nextInt();
                coordinates[1][x] = Integer.parseInt(in.nextLine().substring(1));
            }

            for (int x = 0; x < slices; x++)
            {
                targets[0][x] = in.nextInt();
                targets[1][x] = Integer.parseInt(in.nextLine().substring(1));
            }

            double total, lowest, placeholder;
            total = 0;
            lowest = Integer.MAX_VALUE;

            for (int x = 0; x < slices; x++)
            {
                for (int y = 0; y < slices; y++)
                {
                    placeholder = calculateDistance(coordinates[0][x], coordinates[1][x], targets[0][y], targets[1][y]);
                    if (placeholder < lowest)
                        lowest = placeholder;
                }

                total += lowest;
            }

            System.out.print("Total Distance: " + total);
        }
        
        in.close();
    }

    public static double calculateDistance(int x_cor, int y_cor, int x_tar, int y_tar)
    {
       return Math.sqrt((Math.pow((x_tar-x_cor), 2) + Math.pow((y_tar-y_cor), 2)));
    }
}