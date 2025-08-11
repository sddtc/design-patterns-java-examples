package abstract_factory.checkboxes;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("you have created a MacOSCheckbox");
    }
}
