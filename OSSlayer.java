package Skills.Slayer;

import Skills.Walk;
import org.osbot.script.Script;
import org.osbot.script.ScriptManifest;
import org.osbot.script.rs2.map.Position;
import org.osbot.script.rs2.model.NPC;
import org.osbot.script.rs2.skill.Skill;
import org.osbot.script.rs2.ui.Inventory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class OSSlayer extends Script{

    Position[] toMob;
    String mobName;
    String slayerName;
    int finishID = -1;
    boolean isCompleted = false;
    int[] requiredItems = new int[5];
    Walk walker = new Walk(this);

    enum State {
        ATTACK,TOMOB,TOBANK,TOMASTER,FINISH;
    }
    State state;

    public void onStart() {
        //Initialize GUI
    }
    public int onLoop() throws InterruptedException{

        switch(state) {
            case ATTACK:
                return Attack();
            case TOBANK:
                return toBank();
            case TOMOB:
                walker.WalkPath(toMob,false);
                break;
            case TOMASTER:
                return ToMaster();
            case FINISH:
                return Finish();

        }

        return random(1000, 4000);
    }

    @Override
    public void onMessage(String message) {
        if(message.contains("You've completed your task")) {
            isCompleted = true;
        }
    }

    @Override
    public void onPaint(Graphics g1) {

    }

    public int toBank() {
        return 100;
    }

    public int ToMaster() {
        return 100;
    }

    public int Attack() {
        return 100;
    }

    public int Finish() {
        return 100;
    }

    public void toMob() throws InterruptedException {
        walker.WalkPath(toMob,false);
    }



}

