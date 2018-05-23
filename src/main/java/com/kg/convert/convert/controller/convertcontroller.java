package com.kg.convert.convert.controller;

import com.kg.convert.convert.service.convertservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
@CrossOrigin(origins = "*")
public class convertcontroller {
  @Autowired
  private convertservice cs;
  @RequestMapping(value="/save",method=RequestMethod.POST)
  public ResponseEntity<?> saveFlight(@RequestBody String r){
    //  System.out.println("save"+r);
    String entered=r.replaceAll("\\[", "").replaceAll("\\]","");
    // System.out.println(entered);
    String split[]=entered.split(",");
    String end=" ";
    for(int i=0;i<split.length;i++){
      int num=Integer.parseInt(split[i]);
      end+=(char)num;
    }

    // System.out.println("************"+end+"***************");

        return new ResponseEntity<>(cs.saveRegister(r),HttpStatus.OK);
  }

  // @RequestMapping(method = RequestMethod.GET)
  // public List<convert> getflight() {
  //     return convertservice.findAll();
  // }


  
}