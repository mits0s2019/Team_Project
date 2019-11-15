/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mainpackage.tripPlan.repositories;

import com.mainpackage.tripPlan.dto.DailyBudgetDTO;
import com.mainpackage.tripPlan.model.DailyBudget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface DailyBudgetRepo extends CrudRepository<DailyBudget, Integer> {
    
    @Query("select new com.mainpackage.tripPlan.dto.DailyBudgetDTO("
            + "db.id,db.dayBudget,db.date)  "
            + " from DailyBudget db inner join db.tripId tr  "
            + " where  tr.tripId= :tripId")
    List<DailyBudgetDTO> findDailyBudgetByTripId(@Param("tripId") Integer tripId);
}
