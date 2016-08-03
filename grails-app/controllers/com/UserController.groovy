package com

class UserController {

    def index() {}
    def valid(UserCO userCO){
        if(userCO.validate())
        {
            User user=new User(params)
            user.save()
        }
        else {
            userCO.errors.each{print it}
        }
    }


}
