public class JavaBasic {
    public static void main(String[] args) {
        byte varByte = 10; // -128 ... 127
        byte varByte2 = 126; // -128 ... 127
        short varShort = 2500; // -321768 ... 321767
        int varInt = 5000; // -2147483648 ... 2147483647
        long varLong = 10000; // -9223372036854775808 ... 9223372036854775807

        float varFloat = 2.2F;
        double varDouble = 3.3;
        //Матемачтические операторы
        System.out.println(varShort + varByte);
        System.out.println(varInt - varLong);
        System.out.println(varInt * varFloat);
        System.out.println(varFloat / varDouble);
        System.out.println(varDouble % varByte);
        //Логические операторы
        System.out.println(varDouble == varByte);
        System.out.println(varDouble != varByte);
        System.out.println(varDouble > varByte);
        System.out.println(varDouble < varByte);
        System.out.println(varDouble <= varByte);
        System.out.println(varDouble >= varByte);
        //Переполнение
        System.out.println((short) (varShort + varLong));
        System.out.println((byte) (varByte2 + 1));
    }
}
