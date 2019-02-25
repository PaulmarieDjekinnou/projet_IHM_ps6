package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model {
    private List<String> listDepense;

    public Model(){
        listDepense = new ArrayList();
        listDepense.add("2 Jan  7.50€");    //Tous les prix ont une tab
        listDepense.add("4 Jan  12.50€");
        listDepense.add("12 Jan  20.00€");
    }

    public ObservableList<String> getListDepense(){
        return FXCollections.observableArrayList(listDepense);
    }

}

