package com.example.service.impl;

import com.example.service.TranscriptsService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service("asc")
public class ASCTranscriptsServiceImpl implements TranscriptsService {
    @Override
    public void sort(List<Double> score) {
        Collections.sort(score);
    }
}
