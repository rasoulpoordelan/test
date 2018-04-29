package games.medrick.medrickestan.core.constant.convertor;


import games.medrick.medrickestan.core.constant.PlayerChapterStatus;

public class PlayerChapterConverter extends EnumAttributeConverter<PlayerChapterStatus, Short> {
    @Override
    public PlayerChapterStatus convertToEntityAttribute(Short val) {
        return notNull(PlayerChapterStatus.setValue(val));
    }
}
