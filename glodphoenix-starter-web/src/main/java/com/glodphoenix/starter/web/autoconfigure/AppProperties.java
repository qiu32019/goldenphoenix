package com.glodphoenix.starter.web.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String swagger;
    private String group;
    private String name;
    private String description;
    private String author;
    private String email;
    private String url;
}
