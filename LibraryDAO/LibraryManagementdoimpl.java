package project1.LibraryDAO;

import project1.Library.LibraryManagement;

public class LibraryManagementdoimpl implements LibraryManagementDAO {
    LibraryManagement[] llist = new LibraryManagement[10];
    LibraryManagement l1;
    int index = 0;


    @Override
    public boolean addstudent(LibraryManagement l) {
        if (index <= 5) {
            l.setsId(index);
            llist[index] = l;
            index++;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public boolean updatestudent(LibraryManagement l) {
        if (l != null) {
            int sId = l.getsId();
            llist[sId] = l;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean deletestudent(String semail) {
        for (int i = 0; i <= llist.length; i++) {
            l1 = llist[i];
            if (l1 != null) {
                String cemail1 = l1.getSemail();
                if (cemail1.equals(semail)) {
                    llist[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public LibraryManagement searchallprofile(String semail) {
        for (int i = 0; i < llist.length; i++) {
            l1 = llist[i];
            if (l1 != null) {
                String semail1 = l1.getSemail();
                if (semail1.equals(semail)) {
                    return l1;
                }
            }
        }
        return null;
    }

    @Override
    public LibraryManagement[] showallstudent() {
        boolean haveMembers = false;
        for (int i = 0; i < llist.length; i++) {
            if (llist[i] != null) {
                haveMembers = true;
                break;
            }
        }
        if (haveMembers == true) {
            return llist;
        } else {
            return null;
        }


    }

    public boolean deletestudent(LibraryManagement l) {
        return false;
    }

    @Override
    public boolean searchallprofile(LibraryManagement l) {
        return false;
    }


    //public boolean deletecustomer(String semail) {
    //  }}

}
