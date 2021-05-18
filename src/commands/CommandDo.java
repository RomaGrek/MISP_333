package commands;

import general.HistoryPoint;

public interface CommandDo {
    void doing (String x, String y, String r, HistoryPoint historyPoint);

}
