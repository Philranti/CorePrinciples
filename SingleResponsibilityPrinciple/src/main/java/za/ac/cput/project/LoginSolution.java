package za.ac.cput.project;

import org.hsqldb.rights.User;

public class LoginSolution {

    public void changeEmail(User user)
    {
        if(user.isLocalOnly)
        {
            System.out.println("User is eligible to change email ");//Grant option to change
        }
    }
}
