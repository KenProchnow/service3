package service3;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import service3.resources.GeneralResource;

public class Service3Application extends Application<Service3Configuration> {

    public static void main(final String[] args) throws Exception {
        new Service3Application().run(args);
    }

    @Override
    public String getName() {
        return "Service3";
    }

    @Override
    public void initialize(final Bootstrap<Service3Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Service3Configuration configuration,
                    final Environment environment) {
        GeneralResource generalResource = new GeneralResource();
        environment.jersey().register(generalResource);
    }

}
