package com.websystique.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class Driver {

    @Autowired
    private License license;

    // @Autowired
    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver [license=" + license + "]";
    }

    public License getLicense() {
        return license;
    }
}
