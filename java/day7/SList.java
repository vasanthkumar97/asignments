public class SList
{
    protected Node start;

    protected Node end ;

    public int size;

    public SList()

    {

        start = null;

        end = null;

        size = 0;

    }

    SListIterator getIterator()
    {
        return new SListIterator();
        }
}