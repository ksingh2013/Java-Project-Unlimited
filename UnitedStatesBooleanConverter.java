import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class UnitedStatesBooleanConverter implements AttributeConverter<Boolean, String> {
      @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return dbData.equals("United States");
    }
}