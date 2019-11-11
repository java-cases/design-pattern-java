package com.designpattern.behavior.mediator;

import com.designpattern.behavior.mediator.colleague.Furniture;

import java.util.ArrayList;
import java.util.List;

public class FurnitureRelation {

    private List<Furniture> colleagues = new ArrayList<>(100);

    void addColleague(Furniture furniture) {
        colleagues.add(furniture);
    }

    void removeColleague(Furniture furniture) {
        colleagues.remove(furniture);
    }
}
