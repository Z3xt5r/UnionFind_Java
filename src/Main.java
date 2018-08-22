
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int x;
        int p, q1;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. QucikFind");
        System.out.println("2. QuickUnion");
        System.out.printf("Response : ");
        x = sc.nextInt();
        if(x==2){
        QuickUnion q = new QuickUnion();
        System.out.printf("Input size : ");
        q.QuickUnionUF(sc.nextInt());
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Union");
            System.out.println("2. Connected");
            System.out.println("3. Exit");
            x = sc.nextInt();
            if (x == 3)
                break;
            else if (x == 2) {
                System.out.printf("Input the elements 1. : ");
                p = sc.nextInt();
                System.out.printf("Input the elements 2. : ");
                q1 = sc.nextInt();
                if (q.connected(p, q1))
                    System.out.println("Connected !! ");
                else
                    System.out.println("Not Connected !! ");
            }
            else if (x == 1) {
                System.out.printf("Input the elements 1. : ");
                p = sc.nextInt();
                System.out.printf("Input the elements 2. : ");
                q1 = sc.nextInt();
                q.Union(p, q1);
            }


        }


    }

    else if(x==1){
            QuickFind q = new QuickFind();
            System.out.printf("Input size : ");
            q.QuickFindUF(sc.nextInt());
            while (true) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("1. Union");
                System.out.println("2. Connected");
                System.out.println("3. Exit");
                x = sc.nextInt();
                if (x == 3)
                    break;
                else if (x == 2) {
                    System.out.printf("Input the elements 1. : ");
                    p = sc.nextInt();
                    System.out.printf("Input the elements 2. : ");
                    q1 = sc.nextInt();
                    if (q.connected(p, q1))
                        System.out.println("Connected !! ");
                    else
                        System.out.println("Not Connected !! ");
                }
                else if (x == 1) {System.out.printf("Input the elements 1. : ");
                    p = sc.nextInt();
                    System.out.printf("Input the elements 2. : ");
                    q1 = sc.nextInt();
                    q.Union(p, q1);
                }


            }
        }




    }
}
