import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class QualifiedUnqualifiedConverter implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return attribute ? "qualified" : "disqualified";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return dbData.equals("qualified");
    }
}