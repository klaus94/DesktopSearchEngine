import java.util.*;

public class DefaultCollector implements KeywordCollector
{
    Set<String> getKeywords(Resource res)
    {
    	Set<String> resultSet = new HashSet<String>();
    	resultSet.add(res.getName());

        return resultSet;
    }
}
