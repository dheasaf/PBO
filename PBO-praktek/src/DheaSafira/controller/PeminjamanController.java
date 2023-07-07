/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DheaSafira.controller;
import DheaSafira.model.*;
import java.util.*;
import javax.swing.JOptionPane;
import DheaSafira.view.*;
import javax.swing.table.DefaultTableModel;
import DheaSafira.dao.*;

/**
 *
 * @author ASUS
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    
     public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanDaoImpl() {};
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    
    public void clearForm() {
   
        view.getTxtTglPinjam().setText("");
        view.getTxtTglKembali().setText("");
        
       
    }
    public void isiCombo(){
        view.getCboAnggota().removeAllItems();
        List<Anggota>listAnggota = anggotaDao.getAll();
        for(Anggota anggota: listAnggota){
             view.getCboAnggota().addItem(anggota.getKodeAnggota());
        }
        view.getCboBuku().removeAllItems();
        List<Buku>listBuku = bukuDao.getAll();
         for(Buku buku: listBuku){
            view.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    
     public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = dao.getAll();
        for (Peminjaman a : list) {
            Object[] row = {
                a.getKodeAnggota(),
                a.getKodeBuku(),
                a.getTglPinjam(),
                a.getTglKembali(),
                a.getSelisih()
            };
            tabelModel.addRow(row);
        }
    }
     public void insert() {
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(view.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(view.getTxtTglKembali().getText());
        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view,"Entri Data OK");
    }
      public void update() {
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(view.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(view.getTxtTglKembali().getText());
        dao.update(index, peminjaman);
        JOptionPane.showMessageDialog(view,"Update Data OK");
        
    }
      public void delete(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view,"Delete Data OK");
    }
    
    public void getPeminjaman() {
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = dao.getPeminjaman(index);
        view.getCboAnggota().setSelectedItem(peminjaman.getKodeAnggota());
        view.getCboBuku().setSelectedItem(peminjaman.getKodeAnggota());
        view.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
        view.getTxtTglKembali().setText(peminjaman.getTglKembali());
       
    }
}
