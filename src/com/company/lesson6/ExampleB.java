package com.company.lesson6;

import java.util.ArrayList;
import java.util.List;

public class ExampleB {

    private List<String> list = new ArrayList();

    public ExampleB(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
