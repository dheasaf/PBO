/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhea.dao;
import java.util.List;
import dhea.model.Pengembalian;

/**
 *
 * @author hp
 */
public interface PengembalianInterface {
    public void insert(Pengembalian pengembalian) throws Exception;
    public void update(Pengembalian pengembalian) throws Exception;
    public void delete(Pengembalian pengembalian) throws Exception;
    public Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    public List<Pengembalian> getAll() throws Exception;
}
