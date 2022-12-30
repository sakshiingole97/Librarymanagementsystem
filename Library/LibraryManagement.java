package project1.Library;

import java.time.LocalDate;
import java.time.LocalTime;

public class LibraryManagement {
    private int sId;
    private String name, bookname, semail;
    private long contact;
    LocalDate date=LocalDate.now();
    LocalDate date1=LocalDate.now().plusDays(7);
    LocalTime Time=LocalTime.now();
    public static final String RED="\u001B[35m";
    public static final String RESET="\u001B[0m";


    public LibraryManagement(int sId, String name, String bookname, String semail, long contact) {
        this.sId = sId;
        this.name = name;
        this.bookname = bookname;
        this.semail = semail;
        this.contact = contact;
    }


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {

        this.bookname = bookname;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "Student Id=" + RED+sId+RESET +
                "\nStudent Name=" + RED+name+RESET +
                "\nBook Name=" + RED+bookname+RESET +
                "\nStudent Email=" + RED+semail+RESET +
                "\nContact Number=" + RED+contact+RESET +
                "\nIssuing Date=" + RED+date+RESET +
                "\nReturning Date=" +RED+date1+RESET+
                "\nTime="+RED+Time+RESET;
    }
}