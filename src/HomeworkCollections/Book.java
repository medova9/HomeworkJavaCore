package homeworkCollections;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String authorName;
    private String authorSurname;
    private String authorSecondName;
    private int theDateOfPublishing;
    private int pages;

    Book(String title, String authorName, int theDateOfPublishing, int pages) {
        this.title = title;
        this.authorName = authorName;
        this.theDateOfPublishing = theDateOfPublishing;
        this.pages = pages;
    }

    Book(String title, String authorName, String authorSurname, String authorSecondName, int theDateOfPublishing, int pages) {
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorSecondName = authorSecondName;
        this.theDateOfPublishing = theDateOfPublishing;
        this.pages = pages;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String author) {
        this.authorName = author;
    }

    public int getTheDateOfPublishing() {
        return theDateOfPublishing;
    }

    public void setTheDateOfPublishing(int theDateOfPublishing) {
        this.theDateOfPublishing = theDateOfPublishing;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getTheDateOfPublishing() == book.getTheDateOfPublishing() &&
                getPages() == book.getPages() &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getAuthorSurname(), book.getAuthorSurname()) &&
                Objects.equals(getAuthorSecondName(), book.getAuthorSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthorName(), getAuthorSurname(), getAuthorSecondName(), getTheDateOfPublishing(), getPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorSecondName='" + authorSecondName + '\'' +
                ", theDateOfPublishing=" + theDateOfPublishing +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if (this.compareAuthorSurname(o) == 0) {
            if (this.compareAuthorName(o) == 0) {
                return this.compareAuthorSecondName(o);
            } else return this.compareAuthorName(o);
        } else return this.compareAuthorSurname(o);
    }

    private int compareAuthorSurname(Book o) {
        return this.getAuthorSurname().compareTo(o.getAuthorSurname());
    }

    private int compareAuthorName(Book o) {
        return this.getAuthorName().compareTo(o.getAuthorName());
    }

    private int compareAuthorSecondName(Book o) {
        return this.getAuthorName().compareTo(o.getAuthorSecondName());
    }
}
