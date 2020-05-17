package com.easyapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {

    public final static ObjectMapper mapper = new ObjectMapper();

    public static <T> T toObject(final String json, Class<T> typeClass) {
        try {
            return mapper.readValue(json, typeClass);
        } catch (Exception e) {
            // TODO Log
        }
        return null;
    }

    public static <T> T toObject(InputStream inputStream, Class<T> typeClass) {
        try {
            return mapper.readValue(inputStream, typeClass);
        } catch (Exception e) {
            //TODO
        }
        return null;
    }

    public static String toJson(Object obj) {
        try {
            if (obj == null)
                return null;
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            // TODO Log
        }
        return null;
    }

    public static byte[] toBytes(Object obj) throws IOException {
        ObjectOutputStream oos = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            return bos.toByteArray();
        } finally {
            if (oos != null)
                oos.close();
        }
    }
}
