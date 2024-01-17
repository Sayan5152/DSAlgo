package PrototypeDesignPattern;

public class Demo {
    public static void main(String args[]) {
        BookShop bs1 = new BookShop();
        BookShop bs2 = new BookShop();

        bs1.loadBooksFromDB();
        try {
            /* Here we are creating a clone of bs1 and setting it to bs2.
             * however we are creating a deep copy, as mentioned in the BookShop.java file
             * therefore any changes in bs1 will not impact bs2. This is prototype design pattern
             */
            bs2 = bs1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        bs1.getBookList().remove(3);

        System.out.println(bs1);
        System.out.println(bs2);
    }
}
