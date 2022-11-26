package dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alex Tompkins - 821984
 */
public class DBUtil {
        private static final EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("Lab6SolutionStudent2PU");

    static EntityManagerFactory getEmFactory() {
        return emf;
    }
}