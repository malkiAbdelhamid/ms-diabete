package com.esi.msdiabete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Calendar;

@RestController
@RequestMapping("/api")
public class DataGlucoseController {

    @Autowired
    DataGlucoseRepository dataGlucoseRepository;

    @GetMapping("/add")
    public DataGlucose addNewValue(@RequestParam("year") int year,
                                   @RequestParam("month") int month,
                                   @RequestParam("day") int day,
                                   @RequestParam("hour") int hour,
                                   @RequestParam("minutes") int munites,
                                   @RequestParam("glucose") float glucose)
    {
        Calendar dateInput = Calendar.getInstance();
        dateInput.set(year,month,day,hour,munites,0);

        return dataGlucoseRepository.save(new DataGlucose(null, dateInput.getTime(),glucose));
    }


}
