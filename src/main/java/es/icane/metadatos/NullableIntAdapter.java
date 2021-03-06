package es.icane.metadatos;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author Alejandro Villar <contacto@alejandro-villar.es>
 */
public class NullableIntAdapter extends XmlAdapter<String, Integer> {

    @Override
    public Integer unmarshal(String v) throws Exception {
        if (v == null || v.isEmpty()) {
            return null;
        }
        return Integer.valueOf(v);
    }

    @Override
    public String marshal(Integer v) throws Exception {
        if (v == null) {
            return null;
        }
        return String.valueOf(v);
    }
}
