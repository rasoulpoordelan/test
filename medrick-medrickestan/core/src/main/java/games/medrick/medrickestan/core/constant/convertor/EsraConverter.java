package games.medrick.medrickestan.core.constant.convertor;


import games.medrick.medrickestan.core.constant.Esra;

public class EsraConverter extends EnumAttributeConverter<Esra, Short> {
    @Override
    public Esra convertToEntityAttribute(Short val) {
        return notNull(Esra.setValue(val));
    }
}
