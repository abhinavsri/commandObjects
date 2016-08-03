import java.lang.annotation.Annotation

public class UserCO implements grails.validation.Validateable {
        String userName;
        String password;
        String confirmPassword;
        static constraints={
            userName(nullable:false,blank:false)
            password(nullable:false,blank:false)
            confirmPassword validator:{val,obj->
                if(!(val.compareTo(obj.passowrd)==0))
                {
                    return 'enter the correct password'
                }

            }
        }

    @Override
    boolean nullable() {
        return false
    }

    @Override
    Class<? extends Annotation> annotationType() {
        return null
    }
}

