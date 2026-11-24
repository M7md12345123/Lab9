
package lab;

public class mystring {
    private String Text;
    public mystring() {
        Text = "";  }
    public void setString(String t) {
       Text = t; }
    public String invert() {
        int i, n = Text.length();
        char[] Temp;
        Temp = Text.toCharArray();
        Text = "";
        for (i = 0; i < n; i++) {
            if (Temp[i] >= 'A' && Temp[i] <= 'Z')
                Temp[i] = (char)(Temp[i] - 'A' + 'a');
            else if (Temp[i] >= 'a' && Temp[i] <= 'z')
                Temp[i] = (char)(Temp[i] - 'a' + 'A');
            Text += Temp[i];  }
        return Text;   }
    char[] Convert() {
        return Text.toCharArray(); }
    public double ratio() {
        int i;
        double upper = 0, lower = 0;
        char[] Temp;
        Temp = Text.toCharArray();
        for (i = 0; i < Text.length(); i++) {
            if (Temp[i] >= 'A' && Temp[i] <= 'Z')
                upper++;
            else if (Temp[i] >= 'a' && Temp[i] <= 'z')
                lower++;
        }
        if (lower == 0)
            return 0;
        return upper / lower;
    }
}
