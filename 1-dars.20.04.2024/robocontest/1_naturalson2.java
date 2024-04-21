import java.util.*;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            if (x == 1000) {
                System.out.println("bir ming");
                return;
            }
            byte i1 = (byte)(x/100);
            byte i2 = (byte)(x/10%10);
            byte i3 = (byte)(x%10);
            if(i1 != 0) System.out.print(number(i1) + " yuz ");
            if(i2 != 0) System.out.print(tens(i2) + " ");
            if(i3 != 0) System.out.print(number(i3));
        }

    }

    static String number(byte i) {
        switch (i) {
            case 1:
                return "bir";
            case 2:
                return "ikki";
            case 3:
                return "uch";
            case 4:
                return "to'rt";
            case 5:
                return "besh";
            case 6:
                return "olti";
            case 7:
                return "yetti";
            case 8:
                return "sakkiz";
            case 9:
                return "to'qqiz";
            default:
                return "";
        }
    }

    static String tens(byte i) {
        switch (i) {
            case 1:
                return "o'n";
            case 2:
                return "yigirma";
            case 3:
                return "o'ttiz";
            case 4:
                return "qirq";
            case 5:
                return "ellik";
            case 6:
                return "oltmish";
            case 7:
                return "yetmish";
            case 8:
                return "sakson";
            case 9:
                return "to'qson";
            default:
                return "";
        }
    }
}
