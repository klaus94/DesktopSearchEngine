public class Resource
{
    private String name;
    private String path;
    private ResourceType rt;

    public Resource(String name, String path, ResourceType rt)
    {
        if (name == null || path == null || rt == null)
        {
            throw new NullPointerException();
        }
        if (name.equals("") || path.equals(""))
        {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.path = path;
        this.rt = rt;
    }

    public String getName()
    {
        return name;
    }

    public String getPath()
    {
        return path;
    }

    public ResourceType getType()
    {
        return path;
    }
}
