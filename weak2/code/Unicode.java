package weak2.code;
public class Unicode {
    public static void main(String[] args) {
        char tm = '\u266F';
        System.out.println("Java" + tm);
        int codePoint = 0x1F495;
        System.out.println("codePoint = " + codePoint);
        char hs = Character.highSurrogate(codePoint);
        char ls = Character.lowSurrogate(codePoint);
        char[] item = {hs, ls};
        System.out.println(item);


        //ANSI
        System.out.println("\u001b[38;5;45m Hello world");

        int counter = 1;
        for ( int i = 0; i < 10; i++ ) {
            for ( int j = 0; j < 10; j++ ) {
                System.out.print("\u001b[38;5;" + counter + "m" + counter + "\t");
                counter++;
            }
            System.out.println("\n");
        }
    }
}