package com.company.lesson4;

import java.sql.SQLException;

public class ExceptionExmple {

    private void exampleInner(int a) throws Exception {
        if (a > 0) {
            System.out.println("ok");
        } else if (a == 0) {
            throw new SQLException();
        } else {
            throw new MyException("Cause: cause");
        }
    }

    public void example() {
        try {
            exampleInner(0);
            System.out.println("HERE");
        } catch (SQLException e) {
            System.out.println("I dont care");
        } catch (Exception e) {
            System.out.println("Not ok");
        } finally {
            System.out.println("Anyway");
        }
    }

}
