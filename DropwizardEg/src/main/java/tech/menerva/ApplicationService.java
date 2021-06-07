package tech.menerva;

import com.google.inject.AbstractModule;
import io.dropwizard.setup.Environment;

public class ApplicationService extends AbstractModule {


    private final  Environment environment;
    public ApplicationService(Environment environment) {
        this.environment = environment;
    }
}
