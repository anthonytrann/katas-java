public class CheckUsernames {
    public static boolean checkUsernames(String password){
        if (password.length() <= 4 || password.length() > 20) {
            return false;
        }
        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!(Character.isLowerCase(c) || Character.isDigit(c) || c == '_')) {
                return false;
            }
        }
        return true;
    }
}
