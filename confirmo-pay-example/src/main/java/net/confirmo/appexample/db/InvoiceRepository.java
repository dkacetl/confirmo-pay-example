package net.confirmo.appexample.db;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends PagingAndSortingRepository<InvoiceEntity, String> {

    @Query("select count(e) from InvoiceEntity e")
    long count();
}
