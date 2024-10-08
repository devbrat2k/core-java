package com.devbrat2k.core.streams.sort;

import com.devbrat2k.core.streams.Employee;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Employee> {

    @Override
    public int compare(final Employee e1, final Employee e2) {
        if (e1.getDateOfBirth() == null && e2.getDateOfBirth() == null) {
            return 0;
        } else if(e1.getDateOfBirth() == null) {
            return -1;
        } else if(e2.getDateOfBirth() == null) {
            return 1;
        } else {
            return e1.getDateOfBirth().compareTo(e2.getDateOfBirth());
        }
    }
}
