package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }



    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }


    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString(Job job){
        String name = job.getName();
        String employer = job.getEmployer().getValue();
        return System.lineSeparator() + "ID:" + job.getId() + System.lineSeparator() +"Name:" + name + System.lineSeparator() +"Employer" + employer +  System.lineSeparator() +"Location" + job.getLocation() +System.lineSeparator() + "Position Type" + job.getPositionType()+ System.lineSeparator() + "Core Competency" +job.getCoreCompetency()+ System.lineSeparator();
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
//public boolean equals(Job job1, Job job2) {
//
//    int job1Id = job1.getId();
//    int job2Id = job2.getId();
//    if (job1Id == job2Id) {
//        return true;
//    }
//}
//} ^^^ not quite right?


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
