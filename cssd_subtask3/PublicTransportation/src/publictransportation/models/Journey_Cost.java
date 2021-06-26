/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.models;

import java.io.Serializable;

/**
 *
 * @author KaviDeZeus
 */
public class Journey_Cost implements Serializable {
    
    private String journeyId;
    private String sourceStop;
    private String destinationStop;
    private Float cost;
//    private Float offPeakCost;
//    private Float onPeakCost;
    
    public Journey_Cost(String jId,String sourceStop,String destinationStop, Float cost){
        this.journeyId=jId;
        this.sourceStop=sourceStop;
        this.destinationStop=destinationStop;
        this.cost=cost;
//        this.offPeakCost=offPeakCost;
//        this.onPeakCost=onPeakCost;
    }
    
    public void setJourneyId(String jId){
        this.journeyId=jId;
    }
    public String getJourneyId(){
        return this.journeyId;
    }
    
    public void setSourceStop(String sStop){
        this.sourceStop=sStop;
    }
    public String getSourceStop(){
        return this.sourceStop;
    }
    
    public void setDestinationStop(String dStop){
        this.destinationStop=dStop;
    }
    public String getDestinationStop(){
        return this.destinationStop;
    }
    
    public void setCost(Float cost){
        this.cost=cost;
    }
    public Float getCost(){
        return this.cost;
    }
    
}
