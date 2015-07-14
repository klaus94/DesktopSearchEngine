import java.util.*;

public class DefaultCollector implements KeywordCollector
{
    public Set<String> getKeywords(Resource res)
    {
    	Set<String> resultSet = new HashSet<String>();
    	resultSet.add(res.getName());

        return resultSet;
    }
}
