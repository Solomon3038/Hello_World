package button.direktory6;

import java.io.Console;

public class readConsole {

        public static void main(String[] args) {

            // получаем консоль
            Console console = System.console();
            if(console!=null){
                // считываем данные с консоли
                String login = console.readLine("Введите логин:");
                char[] password = console.readPassword("Введите пароль:");

                console.printf("Введенный логин: %s \n", login);
                console.printf("Введенный пароль: %s \n", new String(password));
            }
        }

    }
//rabotaet cherez konsole tolko