package repository;

import com.gifthommie.backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	@Query("SELECT r FROM Role r WHERE r.name = :roleName")
	public Role getRoleByRoleName(@Param("roleName") String roleName);
	
	@Query("SELECT r FROM Role r WHERE r.id = :id")
	public Role getRoleById(@Param("id") Integer id);
}
