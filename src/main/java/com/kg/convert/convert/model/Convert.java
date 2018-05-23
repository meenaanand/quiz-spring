package com.kg.convert.convert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
    public class Convert {
       @Id
       @GeneratedValue(strategy=GenerationType.AUTO)
       private Long id;
        
       @Column
        private String code;
        /**
         * @return the id
         */
        public Long getId() {
            return id;
        }
        /**
         * @param id the id to set
         */
        public void setId(Long id) {
            this.id = id;
        }
        /**
         * @return the name
         */
        public String getCode() {
            return code;
        }
        /**
         * @param name the name to set
         */
        public void setCode(String code) {
            this.code = code;
        }
    }
