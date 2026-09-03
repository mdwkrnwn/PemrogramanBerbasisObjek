package P1.Tugas;

public class Demo {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();

        laptop.brand = "ASUS";
        laptop.ram = "16 GB";
        laptop.processor = "Intel Core i5";

        monitor.brand = "LG";
        monitor.screenSize = 24;
        monitor.resolution = "1920 x 1080";

        keyboard.brand = "Logitech";
        keyboard.type = "Mechanical";

        mouse.brand = "Logitech";
        mouse.dpi = 1600;

        System.out.println("=== LAPTOP ===");
        laptop.turnOn();
        laptop.printInfo();
        laptop.openApplication();
        laptop.chargeBattery();
        laptop.turnOff();

        System.out.println("\n=== MONITOR ===");
        monitor.turnOn();
        monitor.printInfo();
        monitor.displayImage();
        monitor.adjustBrightness();
        monitor.turnOff();

        System.out.println("\n=== KEYBOARD ===");
        keyboard.printInfo();
        keyboard.typeText();
        keyboard.pressKey();

        System.out.println("\n=== MOUSE ===");
        mouse.printInfo();
        mouse.moveCursor();
        mouse.click();
    }
}