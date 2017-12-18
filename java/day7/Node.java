public class Node
{


        protected int data;

        protected Node link;





    public Node()

        {

            link = null;


        }


    public Node(int d,Node n)

        {

            data = d;

            link = n;

        }


        public void setLink(Node n)

        {

            link = n;

        }

        /*  Function to set data to current Node  */

        public void setData(int d)

        {

            data = d;

        }

        /*  Function to get link to next node  */

        public Node getLink()

        {

            return link;

        }


        public int getData()

        {

            return data;

        }

}