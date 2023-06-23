/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhea.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dhea.dao.AnggotaImpl;
import dhea.dao.AnggotaInterface;
import dhea.dao.BukuImpl;
import dhea.dao.BukuInterface;
import dhea.dao.PeminjamanImpl;
import dhea.dao.PeminjamanInterface;
import dhea.dao.PengembalianImpl;
import dhea.dao.PengembalianInterface;
import dhea.model.Anggota;
import dhea.model.Buku;
import dhea.model.Peminjaman;
import dhea.model.Pengembalian;
import dhea.view.FormPengembalian;

/**
 *
 * @author hp
 */
public class PengembalianController {
    FormPengembalian view;
    Pengembalian model;
    PengembalianInterface dao;
    AnggotaInterface anggotaInterface;
    BukuInterface bukuInterface;
    PeminjamanInterface peminjamanInterface;

    public PengembalianController(FormPengembalian view) {
        this.view = view;
        dao = new PengembalianImpl();
        anggotaInterface = new AnggotaImpl();
        bukuInterface = new BukuImpl();
        peminjamanInterface = new PeminjamanImpl();
    }
    
    public void clear(){
        view.getTxtKodeanggota().setText("");
        view.getTxtNamaanggota().setText("");
        view.getTxtJudulbuku().setText("");
        view.getTxtTanggalpinjam().setText("");
        view.getTxtTanggalDikembalikan().setText("");
        view.getTxtTerlambat().setText("");
        view.getTxtDenda().setText("");
    }
    
    public void insert(){
        try {
            model = new Pengembalian();
            model.setKodeanggota(view.getTxtKodeanggota().getText());
            model.setNamaanggota(view.getTxtKodeanggota().getText());
            model.setKodebuku(view.getTxtKodebuku().getText());
            model.setTglpinjam(view.getTxtTanggalpinjam().getText());
            model.setTgldikembalikan(view.getTxtTanggalDikembalikan().getText());
            model.setTerlambat(Integer.parseInt(view.getTxtTerlambat().getText()));
            model.setDenda(Double.parseDouble(view.getTxtDenda().getText()));
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Successful Insert");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            model = new Pengembalian();
            model.setKodeanggota(view.getTxtKodeanggota().getText());
            model.setKodebuku(view.getTxtKodebuku().getText());
            model.setTglpinjam(view.getTxtTanggalpinjam().getText());
            model.setTgldikembalikan(view.getTxtTanggalDikembalikan().getText());
            model.setTerlambat(Integer.parseInt(view.getTxtTerlambat().getText()));
            model.setDenda(Double.parseDouble(view.getTxtDenda().getText()));
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Update Successful");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
    try {
        int pil = JOptionPane.showConfirmDialog(view, "Apakah Yakin Dihapus?");
            if(pil == 0){
                dao.delete(model);
                JOptionPane.showMessageDialog(view, "Successful Delete");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void viewTable(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTabelPengembalian().getModel();
            tabelModel.setRowCount(0);
            List<Pengembalian> pengembalianList = dao.getAll();
            for (Pengembalian pengembalian : pengembalianList){
                Object[] data = {
                    pengembalian.getKodeanggota(),
                    pengembalian.getKodebuku(),
                    pengembalian.getTglpinjam(),
                    pengembalian.getTgldikembalikan(),
                    pengembalian.getTerlambat(),
                    pengembalian.getDenda()
                };
                tabelModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilNamaanggota(){
        try {
            String kodeanggota = view.getTxtKodeanggota().getText();
            Anggota anggota = anggotaInterface.getAnggota(kodeanggota);
            if (anggota != null){
                view.getTxtNamaanggota().setText(anggota.getNamaanggota());
            } else{
                   JOptionPane.showMessageDialog(view, "Data Tidak Ada!!");
                   view.getTxtNamaanggota().setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void tampilBuku(){
        try {
            String kodebuku = view.getTxtKodebuku().getText();
            Buku buku = bukuInterface.getBuku(kodebuku);
            if (buku != null){
                view.getTxtJudulbuku().setText(buku.getJudulbuku());
            } else{
                   JOptionPane.showMessageDialog(view, "Data Tidak Ada!!");
                   view.getTxtJudulbuku().setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }  
    
    public void tampilTanggal(){
        try {
            String kodeanggota = view.getTxtKodeanggota().getText();
            String kodebuku = view.getTxtKodebuku().getText();
            String tglpinjam = view.getTxtTanggalpinjam().getText();
            
            Peminjaman peminjaman = peminjamanInterface.getPeminjaman(kodeanggota, kodebuku, tglpinjam);
            if (peminjaman != null){
                view.getTxtTanggalkembali().setText(peminjaman.getTglkembali());
            } else{
                   JOptionPane.showMessageDialog(view, "Data Tidak Ada!!");
                   view.getTxtTanggalkembali().setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    public void tanggal(){
        Date Now = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        view.getTxtTanggalDikembalikan().setText(s.format(Now));
    }
    
    public void terlambat(){
        try {
            DateFormat dfl = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = view.getTxtTanggalDikembalikan().getText();
            String tglKembali = view.getTxtTanggalkembali().getText();
            Date d1 = dfl.parse(tglDikembalikan);
            Date d2 = dfl.parse(tglKembali);
            
            long diff = d1.getTime()- d2.getTime();
            long diffDays = diff/(24*60*60*1000);
        
            view.getTxtTerlambat().setText(diffDays+"");
        } catch (ParseException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void denda(){
        double denda = Double.parseDouble(view.getTxtTerlambat().getText());
        view.getTxtDenda().setText((denda * 2000)+"");
    }
}
