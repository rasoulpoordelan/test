package games.medrick.medrickestan.core.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import games.medrick.medrickestan.core.constant.convertor.ConvertedEnum;


import java.util.HashMap;
import java.util.Map;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/

public enum Esra implements ConvertedEnum<Short> {
    A((short) 1),
    B((short) 2),
    C((short) 3);

    private final Short dbValue;

    private Esra(Short dbValue) {
        this.dbValue = dbValue;
    }

    @Override
    public Short getValue() {
        return dbValue;
    }

    // static resolving:
    public static final Map<Short, Esra> dbValues = new HashMap<>();

    static {
        for (Esra value : values()) {
            dbValues.put(value.dbValue, value);
        }
    }

    public static Esra setValue(Short dbValue) {
        return dbValues.get(dbValue);
    }

    @JsonValue
    public Short toJson() {
        return this.getValue();
    }
}
