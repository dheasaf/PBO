/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhea.dao;
import java.util.List;
import dhea.model.Anggota;

/**
 *
 * @author hp
 */
public interface AnggotaInterface {
    public void insert(Anggota anggota) throws Exception;
    public void update(Anggota anggota) throws Exception;
    public void delete(Anggota anggota) throws Exception;
    public Anggota getAnggota(String kode) throws Exception;
    public List<Anggota> getAll() throws Exception;
}
