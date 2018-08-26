package console;

import java.io.Console;

public class Console1 {
    public static void main(String[] args) {

        // получаем консоль
        Console console = System.console();
        if(console!=null){
            // считываем данные с консоли
            String login = console.readLine("Введите логин:");
            char[] password = console.readPassword("Введите пароль:");
//оступ к консоли мы можем получить только из самой консоли. При запуске, например,
// в Netbeans вызов System.console() будет возвращать значение null.
            console.printf("Введенный логин: %s \n", login);
            console.printf("Введенный пароль: %s \n", new String(password));
        }
    }
}
