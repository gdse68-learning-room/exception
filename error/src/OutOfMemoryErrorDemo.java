/*
    @author DanujaV
    @created 9/12/23 - 10:19 AM   
*/

class Db {
    long[] data = new long[10000];
}

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        Db[] obj = new Db[100000];

        for (int i = 0; i < 100000; i++) {
            System.out.println("obj: " + (i+1));
            obj[i] = new Db();
        }
    }
}
