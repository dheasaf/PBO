/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhea.dao;

import java.util.List;
import dhea.model.Buku;

/**
 *
 * @author hp
 */
public interface BukuInterface {
    public void insert(Buku buku) throws Exception;
    public void update(Buku buku) throws Exception;
    public void delete(Buku buku) throws Exception;
    public Buku getBuku(String kode) throws Exception;
    public List<Buku> getAll() throws Exception;
}
