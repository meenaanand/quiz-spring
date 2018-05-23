package com.kg.convert.convert.service;

import java.util.List;

import com.kg.convert.convert.model.Convert;

import org.springframework.stereotype.Service;

@Service
public interface convertservice {
   // public List<convert> findAll();
    public Convert saveRegister (String register);
//   public void updateRegister (convert register , long id);
//    public convert findOne(long id);
//   public void delete (long id);
// }
}