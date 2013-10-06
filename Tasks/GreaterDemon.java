package Skills.Slayer.Tasks;

import Skills.Slayer.STask;
import org.osbot.script.rs2.map.Position;
import org.osbot.script.rs2.utility.Area;

/**
 * Created with IntelliJ IDEA.
 * User: Tyler
 * Date: 10/5/13
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreaterDemon implements STask {
    @Override
    public Position[] getPath() {
        return new Position[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getMobName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Area getCombatArea() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean needsFinisher() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFinisher() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean GroundLevel() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
