package factory_method.buttons;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("it's a windows style button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("windows button says - hi");
    }
}
