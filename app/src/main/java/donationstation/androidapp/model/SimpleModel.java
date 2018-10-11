package donationstation.androidapp.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import donationstation.androidapp.model.DataItem;

public class SimpleModel {
    public static final SimpleModel INSTANCE = new SimpleModel();

    private List<DataItem> items;

    private SimpleModel() {
        items = new ArrayList<>();
    }

    public void addItem(DataItem item) {
        items.add(item);
    }

    public List<DataItem> getItems() {
        return items;
    }

    public DataItem findItemByKey(int key) {
        for (DataItem d : items) {
            if (d.getKey() == key) return d;
        }
        Log.d("MYAPP", "Warning - Failed to find key: " + key);
        return null;
    }
}