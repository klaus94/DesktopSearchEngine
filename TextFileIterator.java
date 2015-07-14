public class TextFileIterator implements java.util.Iterator<String>
{
    //private Resource res;
    private String restText;

    public TextFileIterator(Resource res)
    {
        if (res == null)
        {
            throw new NullPointerException();
        }

    }

    public boolean hasNext()
    {
        //...
    }

    public String next()
    {
        //...
    }

    public void remove()
    {
        throw new UnsupportedOpearationException();
    }

    public String getAsString(Resource res)
    {
        return "We wish you good luck in this exam!\nWe hope you are well pre-\npared.";
    }
}
