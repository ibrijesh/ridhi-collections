package com.ridhi.collections;


public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }


    @Override
    public int compareTo(StudentMarks o) {

        /*
           current object < other object
             return -1
           current object > other object
             return 1
           current object == other object
             return 0
        */

        return this.maths - o.maths;
    }


    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }
}
