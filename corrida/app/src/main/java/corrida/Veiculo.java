/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corrida;

/**
 *
 * @author franc
 */
public class Veiculo {
    
    Motor motor;
    
    Veiculo(Motor v){
        motor = v;
    }
            

        
    public String voar(){
        return motor.voar();
    }
}
