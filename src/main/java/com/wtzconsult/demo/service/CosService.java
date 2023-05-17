package com.wtzconsult.demo.service;

import com.wtzconsult.demo.bo.Cos;
import com.wtzconsult.demo.bo.User;
import com.wtzconsult.demo.repository.CosRepository;
import com.wtzconsult.demo.repository.SectieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CosService {
    private final CosRepository cosRepository;

    public void createCos(User user) {
        Cos newCos = new Cos();
        newCos.setUser(user);
        newCos.setNumberOfProducs(Integer.valueOf(0));
        cosRepository.save(newCos);
    }
}
