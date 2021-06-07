package tech.menerva.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ApplicationConfiguration extends Configuration {


    @Valid
    @NotNull
    @JsonProperty
    private String applicationName;

    @NotNull
    @JsonProperty
    private String environmentName;


    public String getApplicationName() {
        return applicationName;
    }

    public String getEnvironmentName() {
        return environmentName;
    }
}
