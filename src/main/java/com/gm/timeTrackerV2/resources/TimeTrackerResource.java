package com.gm.timeTrackerV2.resources;

import com.codahale.metrics.annotation.Timed;
import com.gm.timeTrackerV2.api.Event;
import io.dropwizard.jersey.params.NonEmptyStringParam;
import org.joda.time.DateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/timetracker")
@Produces(MediaType.APPLICATION_JSON)
public class TimeTrackerResource {

    public TimeTrackerResource() {}

    @GET
    @Timed
    public Event viewUserEvents() {
        String username = "Gregor";

        return new Event(DateTime.now(), username);
    }
}
