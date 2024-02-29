package RestAPI.BuilderPackageDemo;

public class DesignPattern {

    public  DesignPattern step1 ()
    {
        System.out.println("Step 1");
        return this;
    }
    public  DesignPattern step2 (String str){
        System.out.println("Step 2" + str);
        return this;
    }
    public DesignPattern step3 ()
    {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        DesignPattern DP = new DesignPattern();
        DP.step1().step2("test").step3();
    }
}
