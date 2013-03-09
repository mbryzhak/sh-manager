package com.master.form;

public class RatesForm {

    private float sensor1;
    private float sensor2;
    private float sensor3;
    private float sensor4;
    private float sensor5;

    public RatesForm(float sensor1, float sensor2, float sensor3, float sensor4, float sensor5) {
        this.sensor1 = sensor1;
        this.sensor2 = sensor2;
        this.sensor3 = sensor3;
        this.sensor4 = sensor4;
        this.sensor5 = sensor5;
    }

    public float getSensor1() {
        return sensor1;
    }

    public void setSensor1(float sensor1) {
        this.sensor1 = sensor1;
    }

    public float getSensor2() {
        return sensor2;
    }

    public void setSensor2(float sensor2) {
        this.sensor2 = sensor2;
    }

    public float getSensor3() {
        return sensor3;
    }

    public void setSensor3(float sensor3) {
        this.sensor3 = sensor3;
    }

    public float getSensor4() {
        return sensor4;
    }

    public void setSensor4(float sensor4) {
        this.sensor4 = sensor4;
    }

    public float getSensor5() {
        return sensor5;
    }

    public void setSensor5(float sensor5) {
        this.sensor5 = sensor5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sensor1: ").append(sensor1);
        sb.append("Sensor2: ").append(sensor2);
        sb.append("Sensor3: ").append(sensor3);
        sb.append("Sensor4: ").append(sensor4);
        sb.append("Sensor5: ").append(sensor5);
        return sb.toString();
    }
}
