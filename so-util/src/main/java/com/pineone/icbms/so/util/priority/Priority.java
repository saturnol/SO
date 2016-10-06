package com.pineone.icbms.so.util.priority;

/**
 * Created by melvin on 2016. 10. 6..
 */
public enum Priority {
    emergency (1),
    immediately (2),
    schedule(3);

    private final int priorityNum;

    Priority(int priority) {
        this.priorityNum = priority;
    }

    public boolean isHigherPriority(Priority currentProfile , Priority pastProfile){
        boolean inspector = false;
        if(currentProfile.priorityNum < pastProfile.priorityNum){
            return true;
        }
        return inspector;
    }
}