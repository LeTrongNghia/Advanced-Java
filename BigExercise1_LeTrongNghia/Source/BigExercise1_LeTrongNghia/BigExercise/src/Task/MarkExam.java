package Task;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: ..
 */
public class MarkExam {

    private String conten;
    private boolean isPractice;

    public MarkExam() {

    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public boolean isIsPractice() {
        return isPractice;
    }

    public void setIsPractice(boolean isPractice) {
        this.isPractice = isPractice;
    }

    public MarkExam(String conten, boolean isPractice) {
        this.conten = conten;
        this.isPractice = isPractice;
    }

    public void finalize() throws Throwable {

    }

    @Override
    public String toString() {
        return "Exam: " + "conten:" + this.conten + ", isPractice=" + this.isPractice;
    }

}
