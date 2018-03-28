package DB;

import models.Accounting;

import java.util.List;

public interface AccountingStructureDAO {
    void insert (Accounting object);
    List<Accounting> getAll();
    void update(Accounting object);
    void delete(Accounting object);
}
