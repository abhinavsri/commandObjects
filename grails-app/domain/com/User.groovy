package com

class User {
    String userName;
    String fullName;
    String lastName;
    String password;
    String confirmPassword

    static constraints = {
        userName(nullable: false,blank: false)
        fullName(nullable: false,blank: false)
        lastName(nullable: false,blank: false)
        password(nullable: false,blank: false)
       confirmPassword(nullable: false,blank: false)
    }
}
