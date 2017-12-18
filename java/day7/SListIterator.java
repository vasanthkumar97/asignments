public class SListIterator
{
    public void insertAtStart(SList list,int val)

    {

        Node some_node = new Node(val, null);

        list.size++ ;

        if(list.start == null)

        {

            list.start = some_node;

            list.end = list.start;

        }

        else

        {

            some_node.setLink(list.start);

            list.start = some_node;

        }

    }

    /*  Function to insert an element at end  */

    public void insertAtEnd(SList list,int val)

    {

        Node some_node = new Node(val,null);

        list.size++ ;

        if(list.start == null)

        {

            list.start = some_node;

            list.end = list.start;

        }

        else

        {

            list.end.setLink(some_node);

            list.end = some_node;

        }

    }

    /*  Function to insert an element at position  */

    public void insertAtPos(SList list,int val , int pos)

    {

        Node some_node = new Node(val, null);

        Node ptr = list.start;

        pos = pos - 1 ;

        for (int i = 1; i < list.size; i++)

        {

            if (i == pos)

            {

                Node tmp = ptr.getLink() ;

                ptr.setLink(some_node);

                some_node.setLink(tmp);

                break;

            }

            ptr = ptr.getLink();

        }

        list.size++ ;

    }

    public void deleteAtStart(SList list)

    {

        list.start=list.start.link;

        list.size--;
    }

    public void deleteAtEnd(SList list)
    {   Node some_node=list.start;
        try {
            while (some_node.link.link != null)
                some_node = some_node.link;
        }
        catch(NullPointerException exp)
        {

        }
        some_node.link=null;
        list.size--;
    }
    /*  Function to delete an element at position  */



    public void deleteAtPos(SList list,int pos)

    {

        if (pos == 1)

        {

            list.start = list.start.getLink();

            list.size--;

            return ;

        }

        if (pos == list.size)

        {

            Node s = list.start;

            Node t = list.start;

            while (s != list.end)

            {

                t = s;

                s = s.getLink();

            }

            list.end = t;

            list.end.setLink(null);

            list.size --;

            return;

        }

        Node some_node = list.start;

        pos = pos - 1 ;

        for (int i = 1; i < list.size - 1; i++)

        {

            if (i == pos)

            {

                Node tmp = some_node.getLink();

                tmp = tmp.getLink();

                some_node.setLink(tmp);

                break;

            }

            some_node = some_node.getLink();

        }

        list.size-- ;

    }

    /*  Function to display elements  */

    public void display(SList list)

    {

        System.out.print("\nSingly Linked List = ");

        if (list.size == 0)

        {

            System.out.print("empty\n");

            return;

        }

        if (list.start.getLink() == null)

        {

            System.out.println(list.start.getData() );

            return;

        }

        Node some_node = list.start;

        System.out.print(list.start.getData()+ "->");

        some_node = list.start.getLink();

        while (some_node.getLink() != null)

        {

            System.out.print(some_node.getData()+ "->");

            some_node = some_node.getLink();

        }

        System.out.print(some_node.getData()+ "\n");

    }
}