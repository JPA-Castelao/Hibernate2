package resources;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;


    @Override
    public LocalDate unmarshal(String string) throws Exception {
        return LocalDate.parse(string, FORMATTER);
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {
        return localDate.format(FORMATTER);
    }
}
