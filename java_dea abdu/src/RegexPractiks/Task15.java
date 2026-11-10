package RegexPractiks;

public class Task15 {
    public static void main(String[] args) {
        String[] files = {"report.txt", "reportXtxt", "notes.txt", "report.txt.zip"};
        String regex = "(report|notes)\\.txt";
        for (String file : files) {
            System.out.println(file.matches(regex));
        }
    }
}
