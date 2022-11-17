import java.util.*;

public class Hello
{
    public static void main(String[] args)
    {
        Scanner sdp=new Scanner(System.in);

        int topspeed=sdp.nextInt();
        sdp.nextLine();
        String CarName=sdp.nextLine();


        gitLearn mycar = new gitLearn();

        mycar.fast(topspeed,CarName);

        }
    }

