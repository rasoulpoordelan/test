package games.medrick.medrickestan.core.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import games.medrick.medrickestan.core.constant.convertor.ConvertedEnum;


import java.util.HashMap;
import java.util.Map;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

public enum PlayerChapterStatus implements ConvertedEnum<Short> {
    READING((short) 1),
    COMPLETE((short) 2);

    private final Short dbValue;

    private PlayerChapterStatus(Short dbValue) {
        this.dbValue = dbValue;
    }

    @Override
    public Short getValue() {
        return dbValue;
    }

    // static resolving:
    public static final Map<Short, PlayerChapterStatus> dbValues = new HashMap<>();

    static {
        for (PlayerChapterStatus value : values()) {
            dbValues.put(value.dbValue, value);
        }
    }

    public static PlayerChapterStatus setValue(Short dbValue) {
        return dbValues.get(dbValue);
    }

    @JsonValue
    public Short toJson() {
        return this.getValue();
    }
}