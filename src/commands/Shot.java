package commands;

import general.HistoryPoint;
import general.Point;

public class Shot implements CommandDo{
    public Shot() {
        CommandPusk.addCommand("shot", this);
    }


    @Override
    public void doing(String x, String y, String r, HistoryPoint historyPoint) {
        Point point = new Point(Integer.parseInt(x), Integer.parseInt(y), Double.parseDouble(r));
        point.setResult(point.chekPenetration(Integer.parseInt(x), Integer.parseInt(y),Double.parseDouble(r)));
        historyPoint.addPoint(point);
        System.out.println("info: " + point.getResult());
    }
}
