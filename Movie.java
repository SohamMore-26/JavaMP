import java.util.Scanner;

class Movie
{

    void showing()
    {
        String mov1 = "abc", mov2="xyz", mov3="qwe";
        System.out.println("\n\n\n\t\tCurrent showing movies");
        System.out.println("1: "+mov1);
        System.out.println("2: "+mov2);
        System.out.println("3: "+mov3);
    }

    void booking()
    {
        System.out.println("\n\n\nunder construction");
    }

    public static void main(String[] args)
    {
        Movie M = new Movie();
        int ch;
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;
        while(loop)
        {

            System.out.println("\n\n\n\t\tWelcome to Movie Booking System");
            System.out.println("1. View current showing movies");
            System.out.println("2. Book movie tickets");
            System.out.println("3. Admin Window");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    M.showing();
                    break;
                case 2:
                    M.booking();
                    break;
                case 4:
                    loop = false;
                default:
                    break;
            }

        }
    }
}