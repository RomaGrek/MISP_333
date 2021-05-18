package commands;

import general.HistoryPoint;

import java.util.HashMap;
import java.util.Map;

public class CommandPusk {
    /** Карта команд. Ключ - строковое название команды. Значение - классы, реализующие интерфейс CommandDo*/
    private static Map<String, CommandDo> commands = new HashMap<>();

    public static void addCommand(String name, CommandDo commandDo) {
        commands.put(name, commandDo);
    }


    public static void doing(String words, HistoryPoint historyPoint) {
        String[] partsWords = words.split(" ");
        if (words.isEmpty()) {
            return;
        }
        if (partsWords.length == 1) {    // если введено одно слово
            CommandDo commandDo = commands.get(partsWords[0]);
            if(commandDo != null) {    // проверка на правильность программы
                commandDo.doing(null, null, null, historyPoint);
            } else {
                System.out.println("Команды не существует");
            }
        } else if (partsWords.length == 4) {  // если введено 2 слова
            CommandDo commandDo = commands.get(partsWords[0]);
            String x = partsWords[1];
            String y = partsWords[2];
            String r = partsWords[3];
            if (commandDo != null) {
                commandDo.doing(x, y, r, historyPoint);
            } else {
                System.out.println("Команды не существует");
            }
        } else {
            System.out.println("Невенрный ввод команды");
        }

    }


}
