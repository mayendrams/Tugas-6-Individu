/*10116513 Mayendra Muhammad Shiddiq IF 12
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mayendrams.latihanmvcdbc.event;

import edu.mayendrams.latihanmvcdbc.entity.Pelanggan;
import edu.mayendrams.latihanmvcdbc.model.PelangganModel;

/**
 *
 * @author all
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);


}
