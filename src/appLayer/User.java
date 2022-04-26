package appLayer;

public class User
{
    public boolean isValideUser( String sUserName, String sUserPassword)
    {
        if (sUserName.equals("idriss@gmail.com") && sUserPassword.equals("idriss12"))
        {
            return true;
        }

        return false;
    }
}
