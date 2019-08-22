package com.company;

public class node <L> {
     node next;
     L data;

    public node(L data) {
        this.next = next;
        this.data = data;
    }


    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public L getData() {
        return data;
    }

    public void setData(L data) {
        this.data = data;
    }

    public void tampil (){
        System.out.println(data);
    }
    public void malu (){
        System.out.println(data);
    }


}
