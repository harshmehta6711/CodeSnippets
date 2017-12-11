import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RootWordsModify {
    public String replaceWords(List<String> dict, String sentence) {
        sentence=sentence+" ";
        Iterator<String> iter=dict.iterator();
        while(iter.hasNext())
        {
            String dictWord=iter.next();
            System.out.println("-----"+dictWord);
            int k=sentence.indexOf(dictWord);
            System.out.println("-----"+k);

            if(k>=0)
            {
                String temp=sentence.substring(k);
                System.out.println(temp+"----");
                int x = temp.indexOf(' ');
                System.out.println(x+"----");
                String word = temp.substring(0, x);
                System.out.println(word+"----");
                sentence=sentence.replaceAll(word,dictWord);
                System.out.println(sentence+"----");
                // iter.remove(dictWord);
            }
            else {
                return sentence;
            }
        }
        return sentence.trim();

    }

    public static void main(String[] args) {
        RootWordsModify rootWordsModify=new RootWordsModify();
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        String newstr=rootWordsModify.replaceWords(list,"aadsfasf absbs bbab cadsfafs");
        System.out.println(newstr);
    }
}
