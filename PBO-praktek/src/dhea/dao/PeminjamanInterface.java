/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhea.dao;
import java.util.List;
import dhea.model.Peminjaman;

/**
 *
 * @author hp
 */
public interface PeminjamanInterface {
    public void insert(Peminjaman peminjaman) throws Exception;
    public void update(Peminjaman peminjaman) throws Exception;
    public void delete(Peminjaman peminjaman) throws Exception;
    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    public List<Peminjaman> getAll() throws Exception;
}
