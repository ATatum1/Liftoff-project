package org.launchcode.ministrytracker.models;


import javax.persistence.Entity;

    @Entity
    public class Ministry extends AbstractEntity{

        private Members member;

    public Ministry() {
    }
        public Ministry(Members member) {
            this.member = member;
        }
    }





