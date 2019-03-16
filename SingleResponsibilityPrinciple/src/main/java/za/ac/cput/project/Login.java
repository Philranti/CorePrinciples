package za.ac.cput.project;

import org.hsqldb.rights.User;

public class Login { //Violation
    public void changeEmail(User user)
    {
        if(checkAccess(user))
        {
            System.out.println("User is eligible to change email ");//Grant option to change
        }
    }
    public boolean checkAccess(User user) {
        if (user.isLocalOnly) {
            System.out.println("User is valid");//Verify if the user is valid.
        } else {
            System.out.println("User is not valid");
        }
        return false;
    }
}

