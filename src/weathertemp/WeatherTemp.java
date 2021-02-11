/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathertemp;

/**
 *
 * @author Takuto Okamoto Feb 11th, 2021
 */
public class WeatherTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] temps = new double[14];
        
        for(int i = 0; i < temps.length; i++) {
            temps[i] = Math.random() * 150 - 75;
        }
        
        double avg = calcAvg(temps);
        System.out.println("Average temperature is: " + avg);
        
        double maxTemp = calcMax(temps);
        System.out.println("Max temperature is: " + maxTemp);
    }
    
    public static double calcAvg(double[] temps) {
        double sum = 0;
        double avg;
        int count = 0;
        
        for(double temp:temps) {
            if(temp < 50 && temp > -50) {
                sum += temp;
                count++;
            }
        }
        
        if(count == 0) {
            avg = 0;
        } else {
            avg = sum / count;
        }
        
        return Math.floor(avg * 10) / 10;
    }
    
    public static double calcMax(double[] temps) {
        double maxTemp = 0;
        for(double temp:temps) {
            if(temp > maxTemp) {
                maxTemp = temp;
            }
        }        
        return Math.floor(maxTemp * 10) / 10;
    }
}
