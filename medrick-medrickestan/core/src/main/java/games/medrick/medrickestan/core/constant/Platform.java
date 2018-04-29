package games.medrick.medrickestan.core.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import games.medrick.medrickestan.core.constant.convertor.ConvertedEnum;


import java.util.HashMap;
import java.util.Map;

public enum Platform implements ConvertedEnum<Short> {
    ANDROID((short) 1),
    IOS((short) 2);

    private final Short dbValue;

    private Platform(Short dbValue) {
        this.dbValue = dbValue;
    }

    @Override
    public Short getValue() {
        return dbValue;
    }

    // static resolving:
    public static final Map<Short, Platform> dbValues = new HashMap<>();

    static {
        for (Platform value : values()) {
            dbValues.put(value.dbValue, value);
        }
    }

    public static Platform setValue(Short dbValue) {
        return dbValues.get(dbValue);
    }

    @JsonValue
    public Short toJson() {
        return this.getValue();
    }
}
