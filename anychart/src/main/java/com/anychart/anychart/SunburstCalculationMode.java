package com.anychart.anychart;

import java.util.Locale;

/**
 * Sunburst calculation mode.
 */
public enum SunburstCalculationMode implements JsObject.JsObjectInterface {
    ORDINAL_FROM_LEAVES("ordinal-from-leaves"),
    ORDINAL_FROM_ROOT("ordinal-from-root"),
    PARENT_DEPENDENT("parent-dependent"),
    PARENT_INDEPENDENT("parent-independent");

    private final String value;

    SunburstCalculationMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}