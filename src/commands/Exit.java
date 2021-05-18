package commands;

import general.HistoryPoint;

public class Exit implements CommandDo{

    public Exit(){CommandPusk.addCommand("exit",this);}

    @Override
    public void doing(String x, String y, String r, HistoryPoint historyPoint) {
        System.out.println("Вы решили закончить программу.");
        System.exit(0);
    }
}
