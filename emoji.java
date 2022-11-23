import java.util.ArrayList;
import java.util.Scanner;

public class emoji
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);

        int iterations = Integer.parseInt(in.nextLine());
        String word;
        ArrayList<Character> letters = new ArrayList<>();
        boolean add;

        for (int i = 0; i < iterations; i++)
        {
            word = in.nextLine();

            for (int x = 0; x < word.length(); x++)
            {
                add = true;

                if (letters.size() == 0)
                    letters.add(word.charAt(x));
                else
                {
                    for (int y = 0; y < letters.size(); y++)
                    {
                        if (word.charAt(x) == letters.get(y))
                        {
                            System.out.println("Nope");
                            x = word.length();
                            y = letters.size();
                            add = false;
                        }
                    }

                    if (add)
                        letters.add(word.charAt(x));
                }
            }
            
            if (letters.size() == word.length())
                System.out.println("Emote away!");
            letters.clear();
        }

        in.close();
    }
}