import java.util.*;

public class LinkedList

{

    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);


        SList list = new SList();
        SListIterator my_iterator=list.getIterator();

        char ch;


        do

        {

            System.out.println("\nSingly Linked List Operations\n");

            System.out.println("1. insert at begining");

            System.out.println("2. insert at end");

            System.out.println("3. insert at position");

            System.out.println("4. delete at position");

            System.out.println("5. delete at begining");

            System.out.println("6. delete at end");




            int choice = scan.nextInt();

            switch (choice)

            {

                case 1 :

                    System.out.println("Enter integer element to insert");

                    my_iterator.insertAtStart( list,scan.nextInt() );

                    break;

                case 2 :

                    System.out.println("Enter integer element to insert");

                    my_iterator.insertAtEnd( list,scan.nextInt() );

                    break;

                case 3 :

                    System.out.println("Enter integer element to insert");

                    int num = scan.nextInt() ;

                    System.out.println("Enter position");

                    int pos = scan.nextInt() ;
                    System.out.println(list.size);

                    if (pos <= 1 || pos > list.size )

                        System.out.println("Invalid position\n");

                    else

                        my_iterator.insertAtPos(list,num, pos);

                    break;

                case 4 :

                    System.out.println("Enter position");

                    int p = scan.nextInt() ;

                    if (p < 1 || p > list.size )

                        System.out.println("Invalid position\n");

                    else

                        my_iterator.deleteAtPos(list,p);

                    break;

                case 5 :


                    my_iterator.deleteAtStart( list );

                    break;

                case 6 :


                    my_iterator.deleteAtEnd( list );

                    break;


                default :

                    System.out.println("Wrong Entry \n ");

                    break;

            }


            my_iterator.display(list);

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');

    }

}