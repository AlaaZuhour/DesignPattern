/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author alazh
 */
public abstract class Mummels {
    FlyingBehavior fly;
    SwimmingBehavior swim;
    WalkingBehavior walk;
    String type;
    
    public Mummels(String typ){
        this.type=typ;
    }
    public void fly(){
        fly.fly();
    }
    public void swim(){
        swim.swim();
    }
    public void walk(){
        walk.walk();
    }
    public void setFly(FlyingBehavior fly) {
        this.fly = fly;
    }

    public void setSwim(SwimmingBehavior swim) {
        this.swim = swim;
    }

    public void setWalk(WalkingBehavior walk) {
        this.walk = walk;
    }
    
}
