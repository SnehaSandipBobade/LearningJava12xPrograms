package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab180_MultiLevel_exe {
    public static void main(String[] args) {
        Lab177_GrandFather_L1 l1 = new Lab177_GrandFather_L1();
        Lab178_Father_L2 l2 = new Lab178_Father_L2();
        Lab179_Son_L3 l3 = new Lab179_Son_L3();
        l3.sonsextragold();
        l3.home();

        //Dynamic dispatch
        Lab178_Father_L2 fs = new Lab179_Son_L3();
        Lab177_GrandFather_L1 gs = new Lab179_Son_L3();
        Lab177_GrandFather_L1 gf = new Lab178_Father_L2();
        gs.home();
        //cant d ike below:
        //Lab179_Son_L3 sg= new Lab177_GrandFather_L1();
        //Lab179_Son_L3 sf= new Lab178_Father_L2();

    }
}
