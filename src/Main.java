import exceptions.WrongLoginException;
import exceptions.WrongPasswordExceptions;
import java.util.regex.Pattern;
public class Main {
    public static final String REQUIREMENTS = "Логин/пароль должен содержать только латинские буквы, цифры и знак подчеркивания";
    public static void main(String[] args) throws WrongLoginException, WrongPasswordExceptions {
        String login = "login";
        String password = "password";
        String confirmPassword = "password";
        try {
            checkLoginPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());;
        } catch (WrongPasswordExceptions e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Проверка логина и пароля выполнена");
        }



    }
    public static void checkLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordExceptions {
        checkLogin(login);
       checkPassword(password,confirmPassword);

    }
    public static void checkLogin(String login)throws WrongLoginException{
        Pattern p =Pattern.compile("^[A-Za-z0-9_-]{1,20}");
        if (!p.matcher(login).matches()){
            throw new WrongLoginException(String.format("Логин не подходит под требования",login,REQUIREMENTS));
        }
    }
    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordExceptions, WrongLoginException {
        Pattern p =Pattern.compile("^[A-Za-z0-9_-]{1,20}");
        if (!p.matcher(password).matches()){
            throw new WrongLoginException(String.format("Пароль не подходит под требования"));
    } if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExceptions("Пароли не совпадают");
        }
}
}

