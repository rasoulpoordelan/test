package games.medrick.medrickestan.core.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import games.medrick.medrickestan.core.constant.convertor.ConvertedEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

public enum ChapterStatus implements ConvertedEnum<Short> {
    OPEN((short) 1),           // the book is open
    CLOSED((short) 2),         // the book is closed
    EDITING((short) 5),        // the chapter is editing
    PENDING((short) 6),        // the chapter is pending to be accepted by supervisory
    PUBLISHED((short) 7),      // the chapter is published
    REJECTED((short) 8);      // the chapter is rejected by supervisory

    private final Short dbValue;

    private ChapterStatus(Short dbValue) {
        this.dbValue = dbValue;
    }

    @Override
    public Short getValue() {
        return dbValue;
    }

    // static resolving:
    public static final Map<Short, ChapterStatus> dbValues = new HashMap<>();

    static {
        for (ChapterStatus value : values()) {
            dbValues.put(value.dbValue, value);
        }
    }

    public static ChapterStatus setValue(Short dbValue) {
        return dbValues.get(dbValue);
    }

    @JsonValue
    public Short toJson() {
        return this.getValue();
    }
}