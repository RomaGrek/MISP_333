package commands;

import general.HistoryPoint;

public class Help implements CommandDo{

    public Help(){CommandPusk.addCommand("help",this);}

    @Override
    public void doing(String x, String y, String r, HistoryPoint historyPoint) {
        System.out.println("Вам доступны следующие команды:");
        System.out.println("help-Список команд с описанием.");
        System.out.println("exit-Команда для завершения работы.");
        System.out.println("history-Команда для вовода истории выстрелов.");
        System.out.println("shot-Команда выстрела.");
        System.out.println("С параметрами:");
        System.out.println("|X-(-3...5)|");
        System.out.println("|Y-(-4,-3,-2,-1,0,1,2,3,4)|");
        System.out.println("|R-(1,1.5,2.0,2.5,3)|");
    }

}
