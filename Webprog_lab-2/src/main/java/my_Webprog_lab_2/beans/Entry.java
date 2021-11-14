package my_Webprog_lab_2.beans;

import java.io.Serializable;

public class Entry implements Serializable {
    private Double xValue;
    private Double yValue;
    private Double rValue;
    private String currentTime;
    private String executionTime;
    private boolean hitResult;

    public Entry(Double xValue, Double yValue, Double rValue, String currentTime, String executionTime, boolean hitResult) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.rValue = rValue;
        this.currentTime = currentTime;
        this.executionTime = executionTime;
        this.hitResult = hitResult;
    }

    public Double getxValue() {
        return xValue;
    }

    public Double getyValue() {
        return yValue;
    }

    public Double getrValue() {
        return rValue;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public boolean isHitResult() {
        return hitResult;
    }



}
