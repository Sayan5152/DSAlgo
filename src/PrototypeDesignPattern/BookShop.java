package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    List<Book> bookList = new ArrayList<>();

    void loadBooksFromDB() {
        for(int i=0 ; i<10 ; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book " + i);

            getBookList().add(b);

        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    /**
     * Overridden clone method to create deepcopy of current object and return it in new object.
     * This is prototype design pattern where in we r getting a new object that is a deep copy of the current object instead of a shallow copy
     * In doing so, if we change some parameter of the old object, it wont affect the current object
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for(Book b : this.getBookList()) {
            shop.getBookList().add(b);
        }

        return shop;
    }
}
