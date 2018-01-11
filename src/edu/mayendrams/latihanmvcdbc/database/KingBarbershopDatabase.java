/*10116513 Mayendra Muhammad Shiddiq IF 12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mayendrams.latihanmvcdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.mayendrams.latihanmvcdbc.impl.PelangganDaoImpl;
import edu.mayendrams.latihanmvcdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author all
 */
public class KingBarbershopDatabase {

    private static Connection connection;
    private static PelangganDao pelangganDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }

        return connection;
    }

    public static PelangganDao getpPelangganDao() throws SQLException{
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
    
        return pelangganDao;
    }
    
}
