import java.util.NoSuchElementException;

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

        restText = getAsString(res).replace("-\n", "").toCharArray();
    }

    public boolean hasNext()
    {
        if (restText.length == 0) {
            return false;
        }
        int i = 0;
        while(i < restText.length && Character.isDigit(restText[i]) == false && Character.isLetter(restText[i]) == false){
            i++;
        }
        if (restText.length == i) {
            return false;
        }
        return true;
    }

    public String next()
    {
        if (restText.length == 0) {
            throw new NoSuchElementException();
        }
        String solution = "";
        int i = 0;
        while((i < restText.length) && (Character.isDigit(restText[i]) == false) && (Character.isLetter(restText[i]) == false)){
            i++;
        }

        if (i == restText.length) {
            throw new NoSuchElementException();
        }

        while(i < restText.length && (Character.isDigit(restText[i]) || Character.isLetter(restText[i])))
        {
            solution += restText[i];
            //if ((i + 3 < restText.length) && ((restText[i + 1] == '-') && (restText[i + 2] == '\\' && (restText[i + 3] == 'n')))) {
              //  i += 3;
            //} 
            i++;
        }

        String text = "";
        if (i == restText.length) {
            restText = text.toCharArray();
        } else {

            for (int j = i; j < restText.length; j++) {
                text += restText[j];
            }

            restText = text.toCharArray();
        }
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
