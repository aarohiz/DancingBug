import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
/**
 * Write a description of class ZBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DancingBug extends Bug
{
    private int turns; //amount of turns needed
    private int turnComp; //completed turns
    
    DancingBug(int turnsReq)
    {
        turns = turnsReq; //turns = inputed turns
        turnComp = 0; //turns completed set to 0 for now xoxoxo
    }
    public void act()
    {
        if(turnComp < turns)
        {
            turn();
            turnComp++;
        }
        else
        {
            move();
            turnComp = 0;
        }
    }
}
