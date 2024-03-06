package RestAPI.ListenerDemo;

import org.testng.IExecutionListener;

public class CustomizeListener implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        long endTime= System.currentTimeMillis();
        System.out.println("**** *** Started execution at-"+ endTime + "*****     ***");

    }

    @Override
    public void onExecutionFinish() {
        long endTime= System.currentTimeMillis();
        System.out.println("**** *** Finished execution at-"+ endTime + "*****     ***");
    }
}
