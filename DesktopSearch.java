import java.util.*;

public class DesktopSearch
{
    private Map<String, ResourceType> types;
    private Index index;

    public DesktopSearch()
    {
        types = new HashMap<String, ResourceType>();
        index = new Index();
    }

    public void registerType(String extension, ResourceType type)
    {
        if (extension == null || type == null)
        {
            throw new NullPointerException();
        }
        if (extension.equals(""))
        {
            throw new IllegalArgumentException();
        }

        types.put(extension, type);
    }

    public ResourceType getType(String extension)
    {
        if (extension == null)
        {
            return null;
        }
        if (extension.equals(""))
        {
            throw new IllegalArgumentException();
        }

        return types.get(extension);
    }

    public void unregisterType(String extension)
    {
        if (extension == null)
        {
         throw new NullPointerException();
        }
        if (extension.equals(""))
        {
            throw new IllegalArgumentException();
        }

        
        types.remove(extension);
        
    }

    public void registerResource(Resource res)
    {
        if (res == null)
        {
            throw new NullPointerException();
        }

        index.add(res);
    }

    public List<Resource> processRequest(String request)
    {
        return index.getResources(request);
    }

}
