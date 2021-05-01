package lab_17_Analiz_texta;

public class AddSlovo {
    public static int addSlovo(char symbol) {
        if (symbol == ' ' || symbol == ',' || symbol == '.' || symbol == '!' || symbol == '?' || symbol == ';'
                || symbol == ':' || symbol == '(' || symbol == ')' || symbol == '\t' || symbol == '{' || symbol == '}') {
            return 1;
        } else {
            return 0;
        }
    }
}
