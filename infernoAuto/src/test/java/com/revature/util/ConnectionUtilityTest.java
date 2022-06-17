package com.revature.util;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ConnectionUtilityTest {
    /**
     * Method under test: {@link ConnectionUtility#getConnection()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetConnection() throws SQLException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.sql.SQLException: No suitable driver found for jdbc:postgresql://localhost:5432/postgres
        //       at java.sql.DriverManager.getConnection(DriverManager.java:689)
        //       at java.sql.DriverManager.getConnection(DriverManager.java:247)
        //       at com.revature.util.ConnectionUtility.getConnection(ConnectionUtility.java:26)
        //   In order to prevent getConnection()
        //   from throwing SQLException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getConnection().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        ConnectionUtility.getConnection();
    }
}

