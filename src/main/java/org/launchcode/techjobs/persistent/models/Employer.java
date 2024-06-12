package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location required")
    @Size(min = 3, max = 100, message = "Invalid length")
    private String location;

   @OneToMany(/*mappedBy = "employer"*/) // mapping by "employer" would have yielded the same results as the JoinColumn
   @JoinColumn(name = "employer_id") // JoinColumn puts the key into the many side (the items in the list)
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
