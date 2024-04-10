package com.example.controller;

import com.example.service.TranscriptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TranscriptsController {
    @Autowired
    @Qualifier("asc")
    TranscriptsService asc;
    @Autowired
    TranscriptsService desc;
    @RequestMapping("/asc")
    public String asc(Double class1, Double class2, Double class3)
    {
        List<Double> list = new ArrayList<>(List.of(class1, class2, class3));
        asc.sort(list);
        StringBuilder sb = new StringBuilder();
        list.stream().forEach(e -> sb.append(e + " "));
        return sb.toString();
    }

    @RequestMapping("desc")
    public String desc(Double class1, Double class2, Double class3)
    {
        List<Double> list = new ArrayList<>(List.of(class1, class2, class3));
        desc.sort(list);
        StringBuilder sb = new StringBuilder();
        list.stream().forEach(e -> sb.append(e + " "));
        return sb.toString();

    }
}
