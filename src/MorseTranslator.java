import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/morseTranslator")
public class MorseTranslator extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String textAreaValue = request.getParameter("inputArea");
        request.setAttribute("inputArea", textAreaValue);

        Coder coder = new Coder();

        request.setAttribute("outputArea", coder.code(textAreaValue));
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}

class Coder  {
    public String code(String s) {
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'};

        String[] sign = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--.."};

        char[] chars = s.toCharArray();
        ArrayList<String> morse = new ArrayList<>();

        for (int k = 0; k < chars.length; k++) {
            for (int i = 0; i < letters.length; i++) {
                if (chars[k] == letters[i]) {
                    morse.add(sign[i]);
                }
            }
        }
        String s1 = morse.toString().replace("[", "").replace("]", "").replace(",", "");
        return s1;
    }
}

