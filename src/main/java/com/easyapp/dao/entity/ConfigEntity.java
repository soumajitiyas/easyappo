package com.easyapp.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tbl_config")
public class ConfigEntity extends BaseEntity {

    @Column(name = "key")
    private String key;
    @Column(name = "type")
    private String type;
    @Column(name = "value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConfigEntity{" +
                "key='" + key + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
