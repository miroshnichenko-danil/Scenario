public class Scenario {
    static String printTextPerRole(String[] roles, String[] textLines) {
        String[] res = new String[roles.length * 2 + textLines.length];
        int counter = 0;
        for (String s: roles){
            res[counter] = s + ":"+ "\n";
            counter++;
            for (int j = 0; j < textLines.length; j++){
                int indexTwoDots = textLines[j].indexOf(":");
                int isOurText = textLines[j].substring(0, indexTwoDots).indexOf(s);
                if ((isOurText == -1) || (s.length() < indexTwoDots)) continue;
                res[counter] = (j + 1) + ")" + textLines[j].substring(indexTwoDots + 1) + "\n";
                counter++;
            }
            res[counter] = "\n";
            counter++;
        }
        return (String.join("", res));
    }
}
