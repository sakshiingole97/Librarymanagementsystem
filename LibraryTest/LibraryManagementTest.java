package project1.LibraryTest;

import project1.LibraryDAO.*;
import project1.Library.*;

import java.util.Scanner;


public class LibraryManagementTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LibraryManagement l;
        LibraryManagementdoimpl limpl= new LibraryManagementdoimpl();
        ;
        boolean flag;
        int sid,option,Choice,s;
        String sname,semail,bookname;
        long contact;
        final String R="\u001B[33m";
        final String RESET="\u001B[0m";
        System.out.println("..............Welcome to this Book Management...........");
        System.out.println("\n1.Student login\n2.Administration login");
        Choice=sc.nextInt();
        switch(Choice){
        case 1:{
        while(true){
            System.out.println(R+"\n1.Register \n2.Update your profile \n3.Delete profile\n4.Show profile\n5.Logout"+RESET);
            option=sc.nextInt();
            switch(option) {
                case 1: {
                    System.out.print("Enter Student ID:");
                    sid = sc.nextInt();
                    System.out.print("Enter Student Name:");
                    sname = sc.next();
                    System.out.print("Enter Student Email ID:");
                    semail = sc.next();
                    System.out.print("Enter Student Contact Number:");
                    contact = sc.nextLong();
                    System.out.println("" +
                            "   Avaliable Books\n" +
                            "NO.  BOOKNAME   AVALIABLE"+
                            "\n1.     Math       4" +
                            "\n2.    Physics     3" +
                            "\n3.   Chemistry    2" +
                            "\n4.    Biology     1" +
                            "\n5.    English     3");
                    System.out.print("Enter the Book Name:");
                    bookname = sc.next();
                    if((bookname=="Math")||(bookname=="Engilsh")||(bookname=="Physics")||(bookname=="Chemistry")||(bookname=="Biology"))
                    {
                        try
                        {
                            throw new B();
                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                    }


                    {
                        System.out.println("");
                    }
                    l = new LibraryManagement(sid, sname,  semail, bookname,contact);
                    l.setsId(sid);
                    l.setName(sname);
                    l.setSemail(semail);
                    l.setBookname(bookname);
                    l.setContact(contact);
                    flag = limpl.addstudent(l);
                    if (flag == true)
                    {
                        System.out.println("Student registertion done successfully");
                        System.out.println("Book Added to your profile successfully");
                    } else
                    {
                        System.out.println("Error while registering ");
                    }
                    break;

                }
                case 2: {
                    System.out.print("Enter your Email ID:");
                    semail = sc.next();
                    l = limpl.searchallprofile(semail);
                    if (l == null) {
                        System.out.println("No Such Email ID");
                    } else {
                        System.out.println("Your Profile");

                        System.out.println(l);
                        System.out.println("What do you want to update \n1.contact number\n2.Book Name\n3.Email ID");
                        int c = sc.nextInt();
                        switch (c) {
                            case 1: {
                                System.out.print("Enter your new contact number: ");
                                contact = sc.nextLong();
                                l.setContact(contact);
                                break;
                            }
                            case 2: {
                                System.out.println("" +
                                        "  Avaliable Books\n" +
                                        "NO.  BOOKNAME   AVALIABLE"+
                                        "\n1.     Math       4" +
                                        "\n2.    Physics     3" +
                                        "\n3.   Chemistry    2" +
                                        "\n4.    Biology     1" +
                                        "\n5.    English     3");
                                System.out.print("Enter New Book Name:");
                                bookname = sc.next();
                                l.setBookname(bookname);

                                break;
                            }
                            default: {
                                System.out.println("Indvaild choice");
                            }}
                    }
                    break;
                }
                case 3:
                {
                    System.out.print("Enter your email id ");
                    semail=sc.next();
                    l=limpl.searchallprofile(semail);
                    if(l==null) {
                        System.out.print("No such email registered ");
                    }
                    else{
                        System.out.print("Your profile  ");
                        System.out.println(l);
                        System.out.println("Are You Sure You Want To Delete Your Profile\n1.YES\n2.NO");
                        int c=sc.nextInt();
                        if(c==1)
                        {
                            flag=limpl.deletestudent(semail);
                            if(flag)
                                System.out.println("Account deleted sucessfully ");
                            else
                                System.out.println("error while deleting account ");

                        }}
                    break;
                }

                case 4: {
                    LibraryManagement[] llist = limpl.showallstudent();
                    if (llist == null) {
                        System.out.println("Empty database");
                    } else {
                        for (int i = 0; i < llist.length; i++)
                            if (llist[i] != null)
                                System.out.println(llist[i]);
                    }
                    break;
                }

                case 5:
                {
                    System.out.println("Do you want to exit?\tPress yes or no ");
                    char choice2=sc.next().charAt(0);
                    if(choice2=='y') {
                        System.out.println("Thank you!!\n Visit again");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Please select the procedure ");

                    }break;
                }

                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
        }
        //Admin Login
        case 2:
            {
                while(true) {
                    System.out.println("1.Search Student profile\n2.View all student profile\n3.exit");
                    s = sc.nextInt();
                    switch (s) {
                        case 1: {
                            System.out.println("Enter your email id ");
                            semail = sc.next();
                            l = limpl.searchallprofile(semail);
                            if (l == null) {
                                System.out.println("No such email registered ");
                            } else {
                                System.out.println("Your profile  ");
                            }
                            System.out.println(l);
                            break;
                        }
                        case 2: {
                            LibraryManagement[] llist = limpl.showallstudent();
                            if (llist == null) {
                                System.out.println("Empty database");
                            } else {
                                for (int i = 0; i < llist.length; i++)
                                    if (llist[i] != null)
                                        System.out.println(llist[i]);
                            }
                            break;

                        }
                        case 3: {
                            System.exit(0);
                        }
                    }
                }


            }
        }
    }




    static class B extends RuntimeException
    {
       B()
       {
           System.out.println("An Exception has occured");
       }
       public String getmessage()
       {
           return "Book is not avaliable";
       }
       public String toString()
       {
            return "ExceptionHandaling.NotAvaliable:Book is not Avaliable";
       }
    }
    }


