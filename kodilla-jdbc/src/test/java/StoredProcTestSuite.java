package com.kodilla.jdbc;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=0";


        ResultSet rsBefore = statement.executeQuery("SELECT * FROM BOOKS");
        System.out.println("Dane przed wykonaniem procedury:");
        while (rsBefore.next()) {
            System.out.println("ID: " + rsBefore.getInt("BOOK_ID") + ", BESTSELLER: " + rsBefore.getInt("BESTSELLER"));
        }
        rsBefore.close();

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement2.execute(sqlProcedureCall);


        ResultSet rsAfter = statement.executeQuery("SELECT * FROM BOOKS");
        System.out.println("Dane po wykonaniu procedury:");
        while (rsAfter.next()) {
            System.out.println("ID: " + rsAfter.getInt("BOOK_ID") + ", BESTSELLER: " + rsAfter.getInt("BESTSELLER"));
        }
        rsAfter.close();

        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(1, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

}
