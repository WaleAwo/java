package interfaces;

public class InterfaceMain implements Interface1, Interface2 {
    public static void main(String[] args) {

        InterfaceMain interfaceMain = new InterfaceMain();
        interfaceMain.interface1Method();
        interfaceMain.interface2Method();
    }

    @Override
    public void interface1Method() {
        System.out.println("Interface 1: " + interface1Variable);
    }

    @Override
    public void interface2Method() {
        System.out.println("Interface 2: " + interface2Variable);
    }
}
