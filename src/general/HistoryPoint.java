package general;

import java.util.ArrayList;
import java.util.List;

public class HistoryPoint {
    private List<Point> historyList = new ArrayList<>();

    public List<Point> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<Point> historyList) {
        this.historyList = historyList;
    }

    public void addPoint(Point point) {
        historyList.add(point);
    }

}
