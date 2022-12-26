import java.util.Stack;
public class validParenthsess {
    public static boolean isValid(String s) {
        Stack<Integer> parantheses = new Stack<>();
        int flag = 0;
        for(int i = 0; i<s.length(); i++){
            char c;
            c = (char)s.charAt(i);
            int temp = (int)c;
            if(s.length() % 2 != 0){
                return false;
            }
            if(temp == 40 || temp == 91 || temp == 123){
                parantheses.push(temp);
            }
            if(parantheses.isEmpty() && (temp == 41 || temp == 93 || temp == 125)){
                flag++;
                return false;
            }
            if(!parantheses.isEmpty()){
                if(temp == 41 && parantheses.peek() == 40){
                    parantheses.pop();
                }
                else if(temp == 93 && parantheses.peek() == 91){
                    parantheses.pop();
                }
                else if(temp == 125 && parantheses.peek() == 123){
                    parantheses.pop();
                }
                else if(temp == 41 && parantheses.peek() != 40){
                    return false;
                }
                else if(temp == 93 && parantheses.peek() != 91){
                    return false;
                }
                else if(temp == 125 && parantheses.peek() != 123){
                    return false;
                }
            }

        }
        if(flag != 0){
            return false;
        }
        return parantheses.isEmpty();
    }
    public static void main(String[] args){
        String s = "))";
        System.out.println(isValid(s));
        }

}
