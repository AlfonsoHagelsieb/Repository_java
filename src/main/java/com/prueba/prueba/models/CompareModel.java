package com.prueba.prueba.models;

import java.util.ArrayList;
import java.util.List;

public class CompareModel {

    List<String> receta1=new ArrayList<String>(){};
    List<String> receta2=new ArrayList<String>(){};

    public List<String> getReceta1() {
        return receta1;
    }

    public void setReceta1(List<String> receta1) {
        this.receta1 = receta1;
    }

    public List<String> getReceta2() {
        return receta2;
    }

    public void setReceta2(List<String> receta2) {
        this.receta2 = receta2;
    }

}
