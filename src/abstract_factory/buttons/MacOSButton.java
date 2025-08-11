package abstract_factory.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("you have created a MacOSButton");
    }
}
