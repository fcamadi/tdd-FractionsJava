package org.francd.tdd;


public class JavaFraction {

    private Integer num;
    private Integer den;

    public JavaFraction(Integer num,Integer den) {
        this.num = num;
        this.den = den;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getDen() {
        return den;
    }



    public JavaFraction add(JavaFraction other) {
        return new JavaFraction(this.num+other.num,this.den+other.den);
    }


    public boolean compare(JavaFraction other) {
        return this.num==other.num && this.den==other.den;
    }



}
