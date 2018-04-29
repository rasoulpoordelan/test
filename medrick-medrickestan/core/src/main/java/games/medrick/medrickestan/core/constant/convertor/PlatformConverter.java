package games.medrick.medrickestan.core.constant.convertor;


import games.medrick.medrickestan.core.constant.Platform;

public class PlatformConverter extends EnumAttributeConverter<Platform, Short> {
    @Override
    public Platform convertToEntityAttribute(Short val) {
        return notNull(Platform.setValue(val));
    }
}
