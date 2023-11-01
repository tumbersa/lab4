package org.example;

class Man {
    final private int id;
    final private String name;
    final private String gender;
    final private Division division;
    final private double salary;
    final private String dateOfBirth;

    public Man(int id, String name, String gender, Division division, double salary, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Division getDivision() {
        return division;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Division: " + division.getName() +
                ", Salary: " + salary + ", Date of Birth: " + dateOfBirth;
    }
}