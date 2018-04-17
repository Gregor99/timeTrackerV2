package com.gm.timeTrackerV2;

import com.gm.timeTrackerV2.resources.TimeTrackerResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TimeTrackerApplication extends Application<TimeTrackerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TimeTrackerApplication().run(args);
    }

    @Override
    public String getName() {
        return "timeTrackerV2";
    }

    @Override
    public void initialize(final Bootstrap<TimeTrackerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TimeTrackerConfiguration configuration,
                    final Environment environment) {

        final TimeTrackerResource resource = new TimeTrackerResource();
        environment.jersey().register(resource);
    }

}
