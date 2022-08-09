package com.secondmicroservice.Microservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("secondapp")
public class MaximiumMinimumConfiguration {
    private float maximum;
    private float minimum;
    public MaximiumMinimumConfiguration(){

    }
    public MaximiumMinimumConfiguration(float maximum,float minimum){
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public float getMinimum() {
        return minimum;
    }

    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }
}
