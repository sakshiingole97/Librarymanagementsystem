package project1.LibraryDAO;
import project1.Library.LibraryManagement;

public interface LibraryManagementDAO
{

        public boolean addstudent(LibraryManagement l);

        public boolean updatestudent(LibraryManagement l);
        public boolean deletestudent(String semail);

        LibraryManagement[] showallstudent();

        public boolean searchallprofile(LibraryManagement l);



        LibraryManagement searchallprofile(String semail);



}

