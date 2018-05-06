package com.l2jbr.gameserver.model.database;

import com.l2jbr.commons.database.annotation.Table;
import com.l2jbr.commons.database.model.Entity;
import org.springframework.data.annotation.Id;

@Table("droplist")
public class DropList extends Entity<Integer> {
    @Id
    private int mobId;
    private int itemId;
    private int min;
    private int max;
    private int category;
    private int chance;

    @Override
    public Integer getId() {
        return mobId;
    }

    public int getMobId() {
        return mobId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCategory() {
        return category;
    }

    public int getChance() {
        return chance;
    }
}
