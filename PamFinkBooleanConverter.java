import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class PamFinkConverter implements AttributeConverter<Boolean, String> {
    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return dbData.equals("Pam Fink");
    }
}