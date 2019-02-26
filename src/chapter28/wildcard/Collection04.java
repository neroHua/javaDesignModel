package chapter28.wildcard;

import chapter28.bean.Book;
import chapter28.bean.BookEnglish;
import chapter28.bean.Girl;
import chapter28.bean.User;

public class Collection04<T extends Book, K extends User> {
    
    private T book;
    private K user;

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }

    public K getUser() {
        return user;
    }

    public void setUser(K user) {
        this.user = user;
    }

    public static void main(String[] args) {
        Collection04<BookEnglish, Girl> collection02 = new Collection04<>();
        collection02.setBook(new BookEnglish());
        collection02.setUser(new Girl());
        BookEnglish bookEnglish = collection02.getBook();
        Girl girl = collection02.getUser();
        System.out.println(bookEnglish.getType());
        System.out.println(girl.getSex());
    }

}
