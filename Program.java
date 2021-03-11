import java.util.Scanner;

public class Program{

    public static void main (String args[]){

        System.out.println("Type the integer present Hour digit that you're seeing on your clock (0..24)");

        Scanner hh = new Scanner(System.in);

        int hour = hh.nextInt();

        System.out.println(daytime(hour) + ", Mr. Chervoniak");     // Good morning

    }

    static String daytime(int hour){

        if (hour >24 || hour < 0)
            return "Invalid data";
        else if(hour > 21 || hour < 6)
            return "Good night";
        else if(hour >= 15)
            return "Good evening";
        else if(hour >= 11)
            return "Good after noon";
        else
            return "Good morning";
    }
}
