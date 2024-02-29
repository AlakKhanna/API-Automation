package RestAPI.BuilderPackageDemo;

public class NonDesignPattern {
    public  void step1 (){
        System.out.println("Step 1");
    }

    public  void step2 (){
        System.out.println("Step 2");
    }
    public  void step3 (){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {

        NonDesignPattern NP= new NonDesignPattern();
        NP.step1();
        NP.step2();
        NP.step3();

    }
}
