package com.kg.convert.convert.service;

import java.util.List;

import com.kg.convert.convert.model.Convert;
import com.kg.convert.convert.repository.convertrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("convertService")
public class convertserviceimp implements convertservice{

    @Autowired 
    private convertrepository convertRepository;
    // @Override
    // public List<convert> findAll(){
    //     return convertRepository.findAll();
    // }
    @Override
    public Convert saveRegister(String register){
        Convert c=new Convert();
        c.setCode(register);

        return convertRepository.save(c);
    }
    // @Override
    // public void updateRegister(convert register , long id){
    //     register.setId(id);
    //     convertRepository.saveAndFlush(register);
       
    // }

    // @Override
    // public convert findOne(long id){
    //     return convertRepository.findOne(id);
    // }

	// @Override
	// public void delete(long id) {
    //     convertRepository.delete(id);
        
    // }
    
    
}