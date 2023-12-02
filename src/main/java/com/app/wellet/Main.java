package com.app.wellet;

import com.app.wellet.Config.DatabaseConnection;

public class Main {

    public static void main(String[] args){
<<<<<<< HEAD
        System.out.println( System.getenv ("URL") );
        System.out.println ( System.getenv ("PASSWORD") );
        System.out.println (System.getenv ("USERNAME") );
=======
        DatabaseConnection.getConnection();
>>>>>>> 6638f46420c188e01c4df8369582e3bafe05ef0c
    }
}