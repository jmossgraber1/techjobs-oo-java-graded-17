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

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
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

    public String toString() {
//5 if statements that go through the fields
        //check each one for empty or nul
        //will look diff based on data type
        // if it's a string, test against ""
        // if an object, test against getValue
        //if empty, we need to set the value - if it's a string, name = string, if it's an object then employer.setValue()
        //default value needs to be specific "Data not available"
        String returnString = System.lineSeparator() + "ID: " + this.getId() + System.lineSeparator();
        if(this.getName().isBlank()){
            returnString += "Name: Data not available" + System.lineSeparator();
        }
        else{
            returnString += "Name: " + this.getName() + System.lineSeparator();;
        }
        if(this.getEmployer().getValue().isBlank()){
            returnString += "Employer: Data not available" + System.lineSeparator();;
        }
        else{
            returnString += "Employer: " + this.getEmployer().getValue() + System.lineSeparator();;
        }
        if(this.getLocation().getValue().isBlank()){
            returnString += "Location: Data not available" + System.lineSeparator();;
        }
        else{
            returnString += "Location: " + this.getLocation().getValue() + System.lineSeparator();;
        }
        if(this.getPositionType().getValue().isBlank()){
            returnString += "Position Type: Data not available" + System.lineSeparator();;
        }
        else{
            returnString += "Position Type: " + this.getPositionType().getValue() + System.lineSeparator();;
        }

        if(this.getCoreCompetency().getValue().isBlank()){
            returnString += "Core Competency: Data not available" + System.lineSeparator();;
        }
        else{
            returnString += "Core Competency: " + this.getCoreCompetency().getValue() + System.lineSeparator();;
        }
        return returnString;

//        return System.lineSeparator() + "ID: " + this.getId()
//                System.lineSeparator() + "Name: " + this.getName()
//                + System.lineSeparator() + "Employer: " + employer + System.lineSeparator()
//                + "Location: " + this.getLocation()
//                + System.lineSeparator() + "Position Type: "
//                + this.getPositionType() + System.lineSeparator()
//                + "Core Competency: " + this.getCoreCompetency() + System.lineSeparator();
    }

//     TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//      match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


//     TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//      and id.
}