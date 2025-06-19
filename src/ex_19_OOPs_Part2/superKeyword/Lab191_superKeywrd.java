package ex_19_OOPs_Part2.superKeyword;

public class Lab191_superKeywrd
{
    public static void main(String[] args) {

    }
}
class Father {
    Father() {
        System.out.println("DC Father");
    }

    int gold = 10;

    void home() {
        System.out.println("Home Father");
    }
}

class Son extends Father {

    Son(){
        super();
    }

    void bike(){}

    void newHome() {
        super.home();
        System.out.println(super.gold);

        this.bike();
    }
}