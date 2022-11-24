package genome;

import java.util.Scanner;

public class genome 
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);

        int sequences = Integer.parseInt(in.nextLine());
        String A, C, T, G;

        StringBuilder sequence = new StringBuilder();
        char current; 
        int years;
        
        for (int i = 0; i < sequences; i++)
        {
            A = in.nextLine();
            C = in.nextLine();
            T = in.nextLine();
            G = in.nextLine();
            sequence.append(in.nextLine());
            years = Integer.parseInt(in.nextLine());

        
            for (int x = 0; x < years; x++)
            {
                for (int y = 0; y < sequence.length(); y++)
                {
                    current = sequence.charAt(y);

                    switch(current)
                    {
                        case 'A':
                        {
                            sequence.replace(y, y+1, A);
                            y += A.length()-1;
                            break;
                        }
                        case 'C':
                        {
                            sequence.replace(y, y+1, C);
                            y += C.length()-1;
                            break;
                        }
                        case 'T':
                        {
                            sequence.replace(y, y+1, T);
                            y += T.length()-1;
                            break;
                        }
                        case 'G':
                        {
                            sequence.replace(y, y+1, G);
                            y += G.length()-1;
                            break;
                        }
                    }
                }
            }

            int Acount = 0;
            int Ccount = 0;
            int Tcount = 0;
            int Gcount = 0;

            for (int x = 0; x < sequence.length(); x++)
            {
                current = sequence.charAt(x);

                switch(current)
                {
                    case 'A':
                        Acount++;
                        break;
                    case 'C':
                        Ccount++;
                        break;
                    case 'T':
                        Tcount++;
                        break;
                    case 'G':
                        Gcount++;
                        break;
                }
            }

            System.out.println("Genome #" + (i+1) + ": " + Acount + " " + Ccount + " " + Tcount + " " + Gcount);
            
            sequence = new StringBuilder();
        }

        in.close();
    }    
}