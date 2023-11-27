package problems.easy.p1694;

public class JavaSolution {
    public String reformatNumber(String number) {
        number = number.replaceAll("[ -]", "");
        StringBuilder sb = new StringBuilder();
        while (number.length() >= 5) {
            sb.append(number.substring(0, 3));
            number = number.substring(3);
            sb.append(" ");
        }
        if (number.length() == 4) {
            sb.append(number.substring(0, 2)).append(" ").append(number.substring(2));
        } else {
            sb.append(number);
        }

        return sb.toString().trim();
    }
}
