package com.banzhuan.repairservice.dao;

import com.banzhuan.repairservice.entity.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepairDao extends JpaRepository<Repair,Integer> {

    List<Repair> findByApplicantId(Integer applicantId);

    List<Repair> findByRepairmanId(Integer repairmanId);

    List<Repair> findByAddressIdIn(List<Integer> addressId);

    @Modifying
    @Query(value = "update tb_repair r set r.repairmanId=?2,r.state=1 where r.id=?1 and r.repairmanId is null",
            nativeQuery = true)
    Integer repairManGetRepair(Integer id,Integer repairmanId);


    @Modifying
    @Query(value = "update tb_repair r set r.state=2 where r.repairmanId=?2 and r.id=?1",
            nativeQuery = true)
    Integer repairManUpdateRepair(Integer id,Integer repairmanId);

}