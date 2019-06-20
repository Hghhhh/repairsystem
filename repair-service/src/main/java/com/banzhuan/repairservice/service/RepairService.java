package com.banzhuan.repairservice.service;

import com.banzhuan.repairservice.entity.Repair;

import java.util.List;


public interface RepairService {

    Integer addRepair(Repair repair);

    List<Repair> getRepairByApplicantId(Integer applicantId);

    Integer deleteById(Integer id);

    List<Repair> getRepairByRepairmanId(Integer repairmanId);

    List<Repair> getAllRepair();

    List<Repair> getRepairByAddressId(List<Integer> addressIds);

    Integer  repairManGetRepair(Integer repairId,Integer repairmanId);

    Integer reapairManFinshRepair(Integer repairId,Integer repairmanId);

}