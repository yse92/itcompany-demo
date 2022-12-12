package com.solvd.company.staff;

import java.util.Arrays;

public final class Qualification {
    private int experience;
    private String[] education;

    public Qualification() {
    }

    public Qualification(int experience, String[] education) {
        this.experience = experience;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "experience=" + experience +
                ", education=" + Arrays.toString(education) +
                '}';
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }
}
