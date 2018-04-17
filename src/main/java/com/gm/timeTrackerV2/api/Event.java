package com.gm.timeTrackerV2.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.persistence.*;


@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_event")
    private Integer idEvent;

    @Column(name = "time_event")
    private DateTime time_event;

    @Column(name = "username")
    private String username;

    @Column(name = "time_modified")
    private DateTime time_modified;

    @Column(name = "user_modified")
    private String user_modified;


    public Event() {}

    public Event(Integer idEvent) { this.idEvent = idEvent; }

    public Event(DateTime time, String username) {
        this.time_event = time;
        this.username = username;
    }

    @JsonProperty
    public DateTime getTime_event() {
        return time_event;
    }

    @JsonProperty
    public void setTime_event(DateTime time_event) {
        this.time_event = time_event;
    }

    @JsonProperty
    public String getUsername() {
        return username;
    }

    @JsonProperty
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty
    public DateTime getTime_modified() {
        return time_modified;
    }

    @JsonProperty
    public void setTime_modified(DateTime time_modified) {
        this.time_modified = time_modified;
    }

    @JsonProperty
    public String getUser_modified() {
        return user_modified;
    }

    @JsonProperty
    public void setUser_modified(String user_modified) {
        this.user_modified = user_modified;
    }
}
