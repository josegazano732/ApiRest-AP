
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JLG
 */
@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
   public Usuario findByUsername(String username);
   
   @Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);

   
    
    	
    
    
}
