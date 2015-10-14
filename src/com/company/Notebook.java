package com.company;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private ArrayList<Record> records;

    public Notebook() {
        records = new ArrayList<Record>();
    }

    public void add(Record someRecord) {
        records.add(someRecord);
        System.out.println("Record " + someRecord.text + " added");
    }

    public void remove(int index) {
        if (index <= records.size()) {
            records.remove(index - 1);
            System.out.println(index + "record deleted");
        } else
            System.out.println("Element with number " + index + " does not exist");
    }


    public void edit(int index, String newString) {
        if (index <= records.size()) {
            records.get(index - 1).text = newString;
            System.out.println(index + " record changed");
        }else
            System.out.println("Element with number " + index + " does not exist");
    }


    public void viewAll() {
        System.out.println("All records:");
        int i = 1;
        for (Record rec : records) {
            System.out.println(i + " " + rec.text);
        }

    }


}
