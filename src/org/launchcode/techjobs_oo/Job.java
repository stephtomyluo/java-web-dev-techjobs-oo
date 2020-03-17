package org.launchcode.techjobs_oo;
import java.lang.reflect.Array;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId() &&
                getName().equals(job.getName()) &&
                getEmployer().equals(job.getEmployer()) &&
                getLocation().equals(job.getLocation()) &&
                getPositionType().equals(job.getPositionType()) &&
                getCoreCompetency().equals(job.getCoreCompetency());    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    @Override
    public String toString() {
        String[] jobPropertyArr = {String.valueOf(this.id), this.name, this.employer.getValue(), this.location.getValue(), this.positionType.getValue(), this.coreCompetency.getValue()};
        String[] jobArr = new String[6];
        for(int i = 0; i < jobPropertyArr.length; i++) {
            if(jobPropertyArr[i] == "") {
                jobArr[i] = "Data Not Available";
            }else {
                jobArr[i] = jobPropertyArr[i];
            }
        }
        String jobString = "\n" +
                "ID: " + Array.get(jobArr, 0) + "\n" +
                "Name: " + Array.get(jobArr, 1) + "\n" +
                "Employer: " + Array.get(jobArr, 2) + "\n" +
                "Location: " + Array.get(jobArr, 3) + "\n" +
                "Position Type: " + Array.get(jobArr, 4) + "\n" +
                "Core Competency: " + Array.get(jobArr, 5) +
                "\n";
        return jobString;
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

    public int getId() {
        return id;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
