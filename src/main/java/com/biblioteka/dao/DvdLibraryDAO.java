
package com.biblioteka.dao;

import com.biblioteka.model.Dvd;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author Marko
 */
public interface DvdLibraryDAO {
    
    // CREATE
    public Dvd addDvd(Dvd dvd);
    
    // READ
    public Dvd getDvdById(int dvdId);
    public List<Dvd> getAllDvds();
    
    public List<Dvd> searchDvds(Map<SearchTerm, String> criteria);
    public List<Dvd> searchDvds(Predicate<Dvd> filter);
            
    
    // UPDATE
    public void updateDvd(Dvd dvd);
    
    // DELETE
    public Dvd removeDvd(int dvdId);
    
}
