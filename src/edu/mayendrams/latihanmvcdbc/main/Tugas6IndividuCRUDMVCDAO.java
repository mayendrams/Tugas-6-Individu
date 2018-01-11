/*10116513 Mayendra Muhammad Shiddiq IF 12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mayendrams.latihanmvcdbc.main;

import edu.mayendrams.latihanmvcdbc.database.KingBarbershopDatabase;
import edu.mayendrams.latihanmvcdbc.entity.Pelanggan;
import edu.mayendrams.latihanmvcdbc.error.PelangganException;
import edu.mayendrams.latihanmvcdbc.service.PelangganDao;
import edu.mayendrams.latihanmvcdbc.view.MainViewPelanggan;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author all
 */
public class Tugas6IndividuCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(Tugas6IndividuCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
 
            }
        });
    }
}
