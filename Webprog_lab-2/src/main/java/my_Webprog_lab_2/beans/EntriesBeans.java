package my_Webprog_lab_2.beans;

import java.util.ArrayList;
import java.util.List;

public class EntriesBeans {
    private List<Entry> entries;



    public EntriesBeans() {
        this(new ArrayList<>());
    }

    public EntriesBeans(List<Entry> entries) {
        this.entries = entries;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
