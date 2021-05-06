package arrays;

import java.util.Scanner;

class Gift
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        byte T = sc.nextByte();
        byte i = 0;
        byte tot,p,N,a,cu,prev;
        while(i<T)
        {
            tot = 1;
            p = 1;
            N = sc.nextByte();
            prev = sc.nextByte();
            for(a = 1;a < N;a++)
            {
                cu=sc.nextByte();
                if(cu>prev)
                    p++;
                else
                    p=1;
                tot+=p;
                prev=cu;
            }
            System.out.println(tot);
            i++;
        }
    }
}