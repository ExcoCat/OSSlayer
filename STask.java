package Skills.Slayer;

import org.osbot.script.rs2.map.Position;
import org.osbot.script.rs2.utility.Area;

/**
 * Created with IntelliJ IDEA.
 * User: Tyler
 * Date: 10/5/13
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public interface STask {

    public Position[] getPath();
    public String getMobName();
    public Area getCombatArea();
    public boolean needsFinisher();
    public int getFinisher();
    public String getMaster();
    public int[] getRequiredItems();

}
