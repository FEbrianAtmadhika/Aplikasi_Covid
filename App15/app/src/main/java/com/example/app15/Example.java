package com.example.app15;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("states")
    @Expose
    private Integer states;
    @SerializedName("positive")
    @Expose
    private Integer positive;
    @SerializedName("negative")
    @Expose
    private Integer negative;
    @SerializedName("pending")
    @Expose
    private Integer pending;
    @SerializedName("hospitalizedCurrently")
    @Expose
    private Integer hospitalizedCurrently;
    @SerializedName("hospitalizedCumulative")
    @Expose
    private Integer hospitalizedCumulative;
    @SerializedName("inIcuCurrently")
    @Expose
    private Integer inIcuCurrently;
    @SerializedName("inIcuCumulative")
    @Expose
    private Integer inIcuCumulative;
    @SerializedName("onVentilatorCurrently")
    @Expose
    private Integer onVentilatorCurrently;
    @SerializedName("onVentilatorCumulative")
    @Expose
    private Integer onVentilatorCumulative;
    @SerializedName("dateChecked")
    @Expose
    private String dateChecked;
    @SerializedName("death")
    @Expose
    private Integer death;
    @SerializedName("hospitalized")
    @Expose
    private Integer hospitalized;
    @SerializedName("totalTestResults")
    @Expose
    private Integer totalTestResults;
    @SerializedName("lastModified")
    @Expose
    private String lastModified;
    @SerializedName("recovered")
    @Expose
    private Object recovered;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("posNeg")
    @Expose
    private Integer posNeg;
    @SerializedName("deathIncrease")
    @Expose
    private Integer deathIncrease;
    @SerializedName("hospitalizedIncrease")
    @Expose
    private Integer hospitalizedIncrease;
    @SerializedName("negativeIncrease")
    @Expose
    private Integer negativeIncrease;
    @SerializedName("positiveIncrease")
    @Expose
    private Integer positiveIncrease;
    @SerializedName("totalTestResultsIncrease")
    @Expose
    private Integer totalTestResultsIncrease;
    @SerializedName("hash")
    @Expose
    private String hash;

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Example withDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public Example withStates(Integer states) {
        this.states = states;
        return this;
    }

    public Integer getPositive() {
        return positive;
    }

    public void setPositive(Integer positive) {
        this.positive = positive;
    }

    public Example withPositive(Integer positive) {
        this.positive = positive;
        return this;
    }

    public Integer getNegative() {
        return negative;
    }

    public void setNegative(Integer negative) {
        this.negative = negative;
    }

    public Example withNegative(Integer negative) {
        this.negative = negative;
        return this;
    }

    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public Example withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    public Integer getHospitalizedCurrently() {
        return hospitalizedCurrently;
    }

    public void setHospitalizedCurrently(Integer hospitalizedCurrently) {
        this.hospitalizedCurrently = hospitalizedCurrently;
    }

    public Example withHospitalizedCurrently(Integer hospitalizedCurrently) {
        this.hospitalizedCurrently = hospitalizedCurrently;
        return this;
    }

    public Integer getHospitalizedCumulative() {
        return hospitalizedCumulative;
    }

    public void setHospitalizedCumulative(Integer hospitalizedCumulative) {
        this.hospitalizedCumulative = hospitalizedCumulative;
    }

    public Example withHospitalizedCumulative(Integer hospitalizedCumulative) {
        this.hospitalizedCumulative = hospitalizedCumulative;
        return this;
    }

    public Integer getInIcuCurrently() {
        return inIcuCurrently;
    }

    public void setInIcuCurrently(Integer inIcuCurrently) {
        this.inIcuCurrently = inIcuCurrently;
    }

    public Example withInIcuCurrently(Integer inIcuCurrently) {
        this.inIcuCurrently = inIcuCurrently;
        return this;
    }

    public Integer getInIcuCumulative() {
        return inIcuCumulative;
    }

    public void setInIcuCumulative(Integer inIcuCumulative) {
        this.inIcuCumulative = inIcuCumulative;
    }

    public Example withInIcuCumulative(Integer inIcuCumulative) {
        this.inIcuCumulative = inIcuCumulative;
        return this;
    }

    public Integer getOnVentilatorCurrently() {
        return onVentilatorCurrently;
    }

    public void setOnVentilatorCurrently(Integer onVentilatorCurrently) {
        this.onVentilatorCurrently = onVentilatorCurrently;
    }

    public Example withOnVentilatorCurrently(Integer onVentilatorCurrently) {
        this.onVentilatorCurrently = onVentilatorCurrently;
        return this;
    }

    public Integer getOnVentilatorCumulative() {
        return onVentilatorCumulative;
    }

    public void setOnVentilatorCumulative(Integer onVentilatorCumulative) {
        this.onVentilatorCumulative = onVentilatorCumulative;
    }

    public Example withOnVentilatorCumulative(Integer onVentilatorCumulative) {
        this.onVentilatorCumulative = onVentilatorCumulative;
        return this;
    }

    public String getDateChecked() {
        return dateChecked;
    }

    public void setDateChecked(String dateChecked) {
        this.dateChecked = dateChecked;
    }

    public Example withDateChecked(String dateChecked) {
        this.dateChecked = dateChecked;
        return this;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Example withDeath(Integer death) {
        this.death = death;
        return this;
    }

    public Integer getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(Integer hospitalized) {
        this.hospitalized = hospitalized;
    }

    public Example withHospitalized(Integer hospitalized) {
        this.hospitalized = hospitalized;
        return this;
    }

    public Integer getTotalTestResults() {
        return totalTestResults;
    }

    public void setTotalTestResults(Integer totalTestResults) {
        this.totalTestResults = totalTestResults;
    }

    public Example withTotalTestResults(Integer totalTestResults) {
        this.totalTestResults = totalTestResults;
        return this;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Example withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public Object getRecovered() {
        return recovered;
    }

    public void setRecovered(Object recovered) {
        this.recovered = recovered;
    }

    public Example withRecovered(Object recovered) {
        this.recovered = recovered;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Example withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPosNeg() {
        return posNeg;
    }

    public void setPosNeg(Integer posNeg) {
        this.posNeg = posNeg;
    }

    public Example withPosNeg(Integer posNeg) {
        this.posNeg = posNeg;
        return this;
    }

    public Integer getDeathIncrease() {
        return deathIncrease;
    }

    public void setDeathIncrease(Integer deathIncrease) {
        this.deathIncrease = deathIncrease;
    }

    public Example withDeathIncrease(Integer deathIncrease) {
        this.deathIncrease = deathIncrease;
        return this;
    }

    public Integer getHospitalizedIncrease() {
        return hospitalizedIncrease;
    }

    public void setHospitalizedIncrease(Integer hospitalizedIncrease) {
        this.hospitalizedIncrease = hospitalizedIncrease;
    }

    public Example withHospitalizedIncrease(Integer hospitalizedIncrease) {
        this.hospitalizedIncrease = hospitalizedIncrease;
        return this;
    }

    public Integer getNegativeIncrease() {
        return negativeIncrease;
    }

    public void setNegativeIncrease(Integer negativeIncrease) {
        this.negativeIncrease = negativeIncrease;
    }

    public Example withNegativeIncrease(Integer negativeIncrease) {
        this.negativeIncrease = negativeIncrease;
        return this;
    }

    public Integer getPositiveIncrease() {
        return positiveIncrease;
    }

    public void setPositiveIncrease(Integer positiveIncrease) {
        this.positiveIncrease = positiveIncrease;
    }

    public Example withPositiveIncrease(Integer positiveIncrease) {
        this.positiveIncrease = positiveIncrease;
        return this;
    }

    public Integer getTotalTestResultsIncrease() {
        return totalTestResultsIncrease;
    }

    public void setTotalTestResultsIncrease(Integer totalTestResultsIncrease) {
        this.totalTestResultsIncrease = totalTestResultsIncrease;
    }

    public Example withTotalTestResultsIncrease(Integer totalTestResultsIncrease) {
        this.totalTestResultsIncrease = totalTestResultsIncrease;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Example withHash(String hash) {
        this.hash = hash;
        return this;
    }

    @Override
    public String toString() {
        return "Example{" +
                "date=" + date +
                ", states=" + states +
                ", positive=" + positive +
                ", negative=" + negative +
                ", pending=" + pending +
                ", hospitalizedCurrently=" + hospitalizedCurrently +
                ", hospitalizedCumulative=" + hospitalizedCumulative +
                ", inIcuCurrently=" + inIcuCurrently +
                ", inIcuCumulative=" + inIcuCumulative +
                ", onVentilatorCurrently=" + onVentilatorCurrently +
                ", onVentilatorCumulative=" + onVentilatorCumulative +
                ", dateChecked='" + dateChecked + '\'' +
                ", death=" + death +
                ", hospitalized=" + hospitalized +
                ", totalTestResults=" + totalTestResults +
                ", lastModified='" + lastModified + '\'' +
                ", recovered=" + recovered +
                ", total=" + total +
                ", posNeg=" + posNeg +
                ", deathIncrease=" + deathIncrease +
                ", hospitalizedIncrease=" + hospitalizedIncrease +
                ", negativeIncrease=" + negativeIncrease +
                ", positiveIncrease=" + positiveIncrease +
                ", totalTestResultsIncrease=" + totalTestResultsIncrease +
                ", hash='" + hash + '\'' +
                '}';
    }
}