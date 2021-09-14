package model.advanced.converter;

import javax.persistence.AttributeConverter;

public class ZipcodeConverter  implements AttributeConverter<Zipcode, String> {
    /**
     * Converts the value stored in the entity attribute into the
     * data representation to be stored in the database.
     *
     * @param attribute the entity attribute value to be converted
     * @return the converted data to be stored in the database
     * column
     */
    @Override
    public String convertToDatabaseColumn(Zipcode attribute) {
        return attribute.getValue();
    }

    /**
     * Converts the data stored in the database column into the
     * value to be stored in the entity attribute.
     * Note that it is the responsibility of the converter writer to
     * specify the correct <code>dbData</code> type for the corresponding
     * column for use by the JDBC driver: i.e., persistence providers are
     * not expected to do such type conversion.
     *
     * @param dbData the data from the database column to be
     *               converted
     * @return the converted value to be stored in the entity
     * attribute
     */
    @Override
    public Zipcode convertToEntityAttribute(String dbData) {
        if (dbData.length() == 5) return new GermanZipCode(dbData);
        else if (dbData.length() == 4) return new SwissZipcode(dbData);

        throw new IllegalArgumentException("Unsupported zipcode in database: " + dbData);
    }
}
