package enset.ma.aspect;

public class SecurityAspect {

    public boolean authenticate(String user,
                                String password) {

        return user.equals("admin")
                && password.equals("1234");
    }

}