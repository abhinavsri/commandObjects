package com

import grails.validation.Validateable


@Validateable
class UserCO {
    String userName
    String password
    String confirmPassword

    static constraints={
        userName(nullable:false,blank:false)
        password(nullable:false,blank:false)
        confirmPassword validator:{val,obj->
            if(!(val.compareTo(obj.password)==0))
            {
                return 'enter the correct password'
            }

        }
    }


}
