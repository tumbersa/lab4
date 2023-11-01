package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src/main/resources/foreign_names.csv";

        List<Man> people = new ArrayList<>();
        List<Division> divisions = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("id;name;gender;BirtDate;Division;Salary")) {
                    continue;
                }
                String[] data = line.split(";"); // Split the CSV line using the separator

                if (data.length == 6) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String floor = data[2];
                    String dateOfBirth = data[3];
                    String divisionName = data[4];
                    double salary = Double.parseDouble(data[5]);

                    Division division = null;
                    for (Division d : divisions) {
                        if (d.getName().equals(divisionName)) {
                            division = d;
                            break;
                        }
                    }

                    if (division == null) {
                        division = new Division(divisionName);
                        divisions.add(division);
                    }

                    Man man = new Man(id, name, floor, division, salary, dateOfBirth);
                    people.add(man);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Man man : people) {
            System.out.println(man);
        }

        for (Division division: divisions) {
            System.out.println(division);
        }
    }
}