package services.CRUD;

import static com.gemtastic.carshop.tables.Address.ADDRESS;
import static com.gemtastic.carshop.tables.Customer.CUSTOMER;
import com.gemtastic.carshop.tables.records.AddressRecord;
import com.gemtastic.carshop.tables.records.CustomerRecord;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import services.interfaces.CRUDServices;

/**
 *
 * @author Gemtastic
 */
public class CustomerCRUDService implements CRUDServices<CustomerRecord> {

    private final String dbusername = "postgres";
    private final String dbpassword = "g3mt45t1c";
    private final String url = "jdbc:postgresql:postgres";

    @Override
    public CustomerRecord create(CustomerRecord customer) {
        CustomerRecord r = null;

        try (Connection connection = DriverManager.getConnection(url, dbusername, dbpassword)) {
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);

            r = create.newRecord(CUSTOMER);
            r.setAddress(customer.getAddress());
            r.setDateOfBirth(customer.getDateOfBirth());
            r.setEmail(customer.getEmail());
            r.setFirstName(customer.getFirstName());
            r.setGender(customer.getGender());
            r.setLastName(customer.getLastName());
            r.setPhone(customer.getPhone());
            r.store();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return r;
    }

    @Override
    public CustomerRecord read(int customer) {
        CustomerRecord c = null;

        try (Connection connection = DriverManager.getConnection(url, dbusername, dbpassword)) {
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);
            c = create.selectFrom(CUSTOMER).where(CUSTOMER.ID.eq(customer)).fetchOne();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DriverManager.getConnection(url, dbusername, dbpassword)) {
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);

            create.delete(CUSTOMER).where(CUSTOMER.ID.eq(id)).execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(CustomerRecord customerUpdate) {

        boolean success = false;
        try (Connection connection = DriverManager.getConnection(url, dbusername, dbpassword)) {
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);

            create.update(CUSTOMER)
                    .set(CUSTOMER.FIRST_NAME, customerUpdate.getFirstName())
                    .set(CUSTOMER.LAST_NAME, customerUpdate.getLastName())
                    .set(CUSTOMER.GENDER, customerUpdate.getGender())
                    .set(CUSTOMER.EMAIL, customerUpdate.getEmail())
                    .set(CUSTOMER.DATE_OF_BIRTH, customerUpdate.getDateOfBirth())
                    .set(CUSTOMER.PHONE, customerUpdate.getPhone())
                    .where(CUSTOMER.ID.equal(customerUpdate.getId()))
                    .execute();

            success = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }
}
