package org.myApp.firstflow;

/**
 * The main responsibility of a converter is to convert from one POJO type to another.
 * <p>
 * This is an auto generated stub. The user is expected to fill in the details of the conversion below.
 * This stub will not be over-written unless the overwrite checkbox is explicitly selected.
 */

import org.ikasan.spec.component.transformation.Converter;
import org.ikasan.spec.component.transformation.TransformationException;
import org.springframework.stereotype.Component;

@Component
public class MyXToYConverter implements Converter<String, Integer> {
    public Integer convert(String payload) throws TransformationException {
        String[] strings = payload.split(" ");
        int intPart = Integer.valueOf( strings[2] );
        return Integer.valueOf(intPart);
    }
}