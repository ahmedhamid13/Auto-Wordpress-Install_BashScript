#!/bin/bash

source user_Config.sc
# Dir="/DATABASE"
source create_database
source create_user
source grant_user


function install_db {
  
    createDatabase
    createUser
    grantUser

    echo "DataBase installation on mysql done! "
}
