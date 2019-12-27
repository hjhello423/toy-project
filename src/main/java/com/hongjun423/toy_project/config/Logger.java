package com.hongjun423.toy_project.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashMap;

@Slf4j
//@Builder
@ToString
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Logger {
    private int code;
    private String message;
    private LinkedHashMap<String, Object> objectsMapInfo;

    public static class Builder {
        private int code;
        private String message;
        private LinkedHashMap<String, Object> objectsMapInfo;

        public Builder() {
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder objectsMapInfo(Object... objects) {
            if (objectsMapInfo == null || objectsMapInfo.isEmpty()) {
                objectsMapInfo = new LinkedHashMap<>();
            }

            for (Object obj : objects) {
                objectsMapInfo.put(obj.getClass().getName(), obj);
            }
            return this;
        }

        public Builder objectsMapInfo(LinkedHashMap<String, Object> linkedHashMap) {
            this.objectsMapInfo = linkedHashMap;
            return this;
        }
    }

    public Logger(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.objectsMapInfo = builder.objectsMapInfo;
    }

}
