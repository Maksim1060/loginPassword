import exceptions.WrongLoginException;
import exceptions.WrongPasswordExceptions;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }

    public static void checkLoginPassword(String login, String password, String confirmPassword) {

    }


        public static void checkLogin(String login)throws WrongLoginException{
        Pattern p =Pattern.compile("^[A-Za-z0-9_-]{1,20}");
        if (!p.matcher(login).matches()){
            throw new WrongLoginException(String.format("Логин не подходит под требования",login));
        }
    }

    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordExceptions {
        Pattern p =Pattern.compile("^[A-Za-z0-9_-]{1,20}");
        if (!p.matcher(password).matches()){
            throw new WrongLoginException(String.format("Пароль не подходит под требования",));
    } if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExceptions("Пароли не совпадают");
        }
}
}

