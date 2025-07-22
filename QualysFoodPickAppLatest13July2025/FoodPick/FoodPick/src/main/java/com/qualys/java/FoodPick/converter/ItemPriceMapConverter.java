package com.qualys.java.FoodPick.converter;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class ItemPriceMapConverter implements AttributeConverter<Map<String, Double>, String> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, Double> map) {
        try {
            return mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert map to JSON", e);
        }
    }

    @Override
    public Map<String, Double> convertToEntityAttribute(String json) {
        try {
            return mapper.readValue(json, new TypeReference<Map<String, Double>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to convert JSON to map", e);
        }
    }
}
