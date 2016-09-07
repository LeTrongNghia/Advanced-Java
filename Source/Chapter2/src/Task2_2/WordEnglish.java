package Task2_2;
/* Author: Lê Trọng Nghia
 * Date: 7/9/2016
 * Version: V1.0
 * Description: use to define for wordEnglish
 */
public class WordEnglish implements Comparable<WordEnglish>{
    public String word;
    public String meaning;
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public WordEnglish(String word, String meaning) {
        super();
        this.word = word;
        this.meaning = meaning;
    }
    
    /*
     * use to print wordEnglish
     * return String
     */
    public String toString() {
        return this.word + "-" + this.meaning;
    }
    
    /*
     * use to compare wordEnglish
     */
    @Override
    public int compareTo(WordEnglish o) {
        // TODO Auto-generated method stub
        return (this.word).compareTo(o.word);
    }
}
