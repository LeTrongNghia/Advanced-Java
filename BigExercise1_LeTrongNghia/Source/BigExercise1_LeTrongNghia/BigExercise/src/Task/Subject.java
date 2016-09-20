package Task;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for Subject
 */
public class Subject {

    private String endDate;
    private String name;
    private int numberOfLesson;
    private String startDate;
    private MarkExam markExam;
    private Mark dailyMark;

    public Subject() {

    }

    public Subject(String endDate, String name, int numberOfLesson, String startDate, MarkExam markExam, Mark dailyMark) {
        this.endDate = endDate;
        this.name = name;
        this.numberOfLesson = numberOfLesson;
        this.startDate = startDate;
        this.markExam = markExam;
        this.dailyMark = dailyMark;
    }

    public void finalize() throws Throwable {

    }

    public MarkExam getMarkExam() {
        return markExam;
    }

    public void setMarkExam(MarkExam markExam) {
        this.markExam = markExam;
    }

    public Mark getDailyMark() {
        return dailyMark;
    }

    public void setDailyMark(Mark dailyMark) {
        this.dailyMark = dailyMark;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.startDate + "\t" + this.endDate;
    }

}
