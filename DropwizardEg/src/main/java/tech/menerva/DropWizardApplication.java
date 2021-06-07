package tech.menerva;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import tech.menerva.config.ApplicationConfiguration;
import tech.menerva.health.ApplicationHealthCheck;
import tech.menerva.resource.EmployeeResource;
import tech.menerva.resource.HelloResource;
import tech.menerva.resource.StudentResource;

public class DropWizardApplication extends Application<ApplicationConfiguration> {
    @Override
    public void run(ApplicationConfiguration configuration, Environment environment) throws Exception {
        environment.healthChecks().register(this.getName(), new ApplicationHealthCheck());
        ApplicationService serviceModule=new ApplicationService(environment);
        Injector injector = Guice.createInjector(serviceModule);
        environment.jersey().register(injector.getInstance(HelloResource.class));
        environment.jersey().register(injector.getInstance(StudentResource.class));
        environment.jersey().register(injector.getInstance(EmployeeResource.class));
    }

    public static void main(String[] args) throws  Exception{
        new DropWizardApplication().run(args);
    }
}
