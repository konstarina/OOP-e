import java.util.Stack;

public class ValidationControl {
    static private Stack<String> stack;

    static boolean isValid(String expression)
    {
        stack = new Stack<String>();
        for (int i = 0; i < expression.length(); i++)
        {
            char temp = expression.charAt(i);
            if (temp == '(')
            {
                stack.push(String.valueOf(temp));

            }
            else if (temp == ')')
            {
                if (stack.empty())
                {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }

    }
