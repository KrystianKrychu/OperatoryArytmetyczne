package pl.akademia108;

public class Main {

    public static void main(String[] args) {

        byte varByte = 127;

        short sumShort = (short) (varByte + 2);
        System.out.println("sumShort: " + sumShort);

        byte minusByte = (byte) (varByte - 2);
        System.out.println("minusByte: " + minusByte);

        byte divideByte = (byte) (varByte / 2);
        System.out.println("divideByte: " + divideByte);

        short multipleShort = (short) (varByte * 2);
        System.out.println("multipleShort: " + multipleShort);

    }
}
