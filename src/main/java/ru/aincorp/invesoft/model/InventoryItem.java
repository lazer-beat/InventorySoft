package ru.aincorp.invesoft.model;

/**
 * Created by Алмаз on 12.07.14.
 */
public class InventoryItem {

    private String group;
    private String name;
    private String serialNumber;
    private String idOfInventoryItem;
    private Enum state;
    private long count;
    private String comment;

    public InventoryItem() {
    }

    public InventoryItem(String group, String name, String serialNumber, String idOfInventoryItem, Enum state, long count, String comment) {
        this.group = group;
        this.name = name;
        this.serialNumber = serialNumber;
        this.idOfInventoryItem = idOfInventoryItem;
        this.state = state;
        this.count = count;
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIdOfInventoryItem() {
        return idOfInventoryItem;
    }

    public void setIdOfInventoryItem(String idOfInventoryItem) {
        this.idOfInventoryItem = idOfInventoryItem;
    }

    public Enum getState() {
        return state;
    }

    public void setState(Enum state) {
        this.state = state;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
