package com.example.service.impl;

import com.example.service.TranscriptsService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service("desc")
public class DESCTranscriptsServiceImpl implements TranscriptsService {

    @Override
    public void sort(List<Double> score) {
        Collections.sort(score, new Comparator<Double>()
        {
            @Override
            public int compare(Double o1, Double o2) {
                if (o1 > o2) return -1;
                if (o1 < o2) return 1;
                return 0;
            }
        });
    }
}
