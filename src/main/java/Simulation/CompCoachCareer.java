package Simulation;

import java.util.Comparator;

/**
 * Created by Anthony on 12/30/2017.
 */

class CompCoachCareer implements Comparator<HeadCoach> {
    @Override
    public int compare(HeadCoach a, HeadCoach b) {
        return a.getCoachCareerScore() > b.getCoachCareerScore() ? -1 : a.getCoachCareerScore() == b.getCoachCareerScore() ? 0 : 1;
    }
}
