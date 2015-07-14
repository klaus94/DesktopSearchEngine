public class TextFileIterator implements java.util.Iterator<String>
{
    //private Resource res;
    private char[] restText;

    public TextFileIterator(Resource res)
    {
        if (res == null)
        {
            throw new NullPointerException();
        }

        if (res.equals("")) {
            throw new IllegalArgumentException();
        }

        restText = getAsString(res).toCharArray();
    }

    public boolean hasNext()
    {
        int i = 0;
        while(Character.isDigit(restText[i]) == false && Character.isLetter(restText[i]) == false && i < restText.length){
            i++;
        }
        if (restText.length == i) {
            return false;
        }
        return true;
    }

    public String next()
    {
        String solution = "";
        int i = 0;
        while(Character.isDigit(restText[i]) == false && Character.isLetter(restText[i]) == false && i < restText.length){
            i++;
        }

        while((Character.isDigit(restText[i]) || Character.isLetter(restText[i])) && i < restText.length)
        {
            solution += restText[i];
            if (restText[i + 1] == 45 && restText[i + 2] == 92 && restText[i + 3] == 110) {
                i += 3;
            } 
            i++;
        }

        String text = "";
        for (int j = i; j <= restText.length; j++) {
            text += restText[j];
        }

        restText = text.toCharArray();
        return solution;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public String getAsString(Resource res)
    {
        return "We wish you good luck in this exam!\nWe hope you are well pre-\npared.";
    }
}
