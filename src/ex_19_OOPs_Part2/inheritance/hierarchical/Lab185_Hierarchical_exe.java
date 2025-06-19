package ex_19_OOPs_Part2.inheritance.hierarchical;

import ex_19_OOPs_Part2.inheritance.multilevel.Lab179_Son_L3;

public class Lab185_Hierarchical_exe {
    public static void main(String[] args) {
        Lab182_Son_H2 s1 = new Lab182_Son_H2();
        s1.H2();
        s1.home();

        Lab183_Son2_H2 l1 = new Lab183_Son2_H2();
        l1.SnH2();

        Lab184_Daughter1_H2 r1 = new Lab184_Daughter1_H2();
        r1.DH1();
        r1.home();
    }
}
