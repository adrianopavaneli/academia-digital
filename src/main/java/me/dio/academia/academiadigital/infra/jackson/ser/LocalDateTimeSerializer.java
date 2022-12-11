package me.dio.academia.academiadigital.infra.jackson.ser;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import me.dio.academia.academiadigital.infra.utils.JavaTimeUtils;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateTimeSerializer extends StdSerializer<LocalDateTime> {

	private static final long serialVersionUID = -6347158617481757931L;

	public LocalDateTimeSerializer() {
        super(LocalDateTime.class);
    }

    @Override
    public void serialize(final LocalDateTime value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER));
    }
}
