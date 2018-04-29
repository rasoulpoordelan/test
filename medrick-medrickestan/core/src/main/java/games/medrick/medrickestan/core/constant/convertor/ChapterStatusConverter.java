package games.medrick.medrickestan.core.constant.convertor;


import games.medrick.medrickestan.core.constant.ChapterStatus;

public class ChapterStatusConverter extends EnumAttributeConverter<ChapterStatus, Short> {
    @Override
    public ChapterStatus convertToEntityAttribute(Short val) {
        return notNull(ChapterStatus.setValue(val));
    }
}
