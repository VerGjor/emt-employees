package mk.ukim.finki.emt.vergjor.repository;

import mk.ukim.finki.emt.vergjor.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("select d from Department d where d.id = :department_id")
    Department findByDepartmentID(@Param("department_id") int department_id);

}
