/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhea.controller;
import dhea_model.*;
import dhea_dao.*;
import java.util.*;
import dhea_view.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WIN10PC
 */
public class Anggota_controller {
      FormAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    
    public Anggota_controller (FormAnggota view){
        this.view = view;
        dao = new AnggotaDaoImpl();
    }
    
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = dao.getAll();
        for (Anggota a : list){
            Object[] row = {
                a.getKodeanggota(),
                a.getNamaanggota(),
                a.getAlamat(),
                a.getJeniskelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
}
