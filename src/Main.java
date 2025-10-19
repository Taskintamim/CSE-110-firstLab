//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //(byte, short, int, long, float, double, char, and boolean).
        byte  b = 10;
        short s = 30;
        int i = 50;
        long l = 12345;
        float f = 69.23f;
        double d = 40.3;
        char c = 'T';
        boolean bool = true;
        System.out.println("byte value: " + b + ", size: " + Byte.BYTES + " bytes");
        System.out.println("short value: " + s + ", size: " + Short.BYTES + " bytes");
        System.out.println("int value: " + i + ", size: " + Integer.BYTES + " bytes");
        System.out.println("long value: " + l + ", size: " + Long.BYTES + " bytes");
        System.out.println("float value: " + f + ", size: " + Float.BYTES + " bytes");
        System.out.println("double value: " + d + ", size: " + Double.BYTES + " bytes");
        System.out.println("char value: " + c + ", size: " + Character.BYTES + " bytes");
        System.out.println("boolean value: " + bool + ", size: 1 byte");

    }
}