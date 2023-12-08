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

    /**
     * @return id - private property of class Man
     */
    public int getId() {
        return id;
    }
    /**
     * @return name - private property of class Man
     */
    public String getName() {
        return name;
    }
    /**
     * @return gender - private property of class Man
     */
    public String getGender() {
        return gender;
    }
    /**
     * @return division - private property of class Man
     */
    public Division getDivision() {
        return division;
    }
    /**
     * @return salary - private property of class Man
     */
    public double getSalary() {
        return salary;
    }
    /**
     * @return dateOfBirth - private property of class Man
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * @return string containing all the properties of the class
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Division: " + division.getId()+ " " + division.getName() +
                ", Salary: " + salary + ", Date of Birth: " + dateOfBirth;
    }
}