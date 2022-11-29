package hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class hangman 
{
    public static void main (String [] args)
    {
        Scanner  in = new Scanner(System.in);

        int categories = Integer.parseInt(in.nextLine());
        String category;
        StringBuilder word = new StringBuilder();
        int words, games;
        ArrayList<String> dictionary = new ArrayList<>();

        for (int i = 0; i < categories; i++)
        
        {
            category = in.nextLine();
            words = Integer.parseInt(in.nextLine());

            for (int x = 0; x < words; x++)
            {
                dictionary.add(in.nextLine());
            }

            games = Integer.parseInt(in.nextLine());

            for (int x = 0; x < games; x++)
            {
                word.append(in.nextLine());

                boolean fair = false;

                for (int y = 0; y < dictionary.size(); y++)
                {
                    if (dictionary.get(y).length() == word.length())
                    {
                        boolean mismatch = 
                        for (int z = 0; z < dictionary.get(y).length(); z++)
                        {
                            if (dictionary.get(y).charAt(z) != '_' || dictionary.get(y).charAt(z) != word.charAt(y))
                            {       
                                fair = false;
                                break;
                            }    
                        }

                        System.out.println("Z-value: " + z);
                    }
                    else
                    {
                        fair = false;
                    }
                }

                if (fair)
                    System.out.println("No cheaters here!");
                else
                    System.out.println("That's not a word for a(n) " + category);

                word = new StringBuilder();
            }

            dictionary.clear();
        }

        in.close();
    }   
}