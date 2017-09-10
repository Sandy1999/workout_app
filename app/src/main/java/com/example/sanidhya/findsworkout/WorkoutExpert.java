package com.example.sanidhya.findsworkout;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String> getWorkouts(String workoutTypes){
        List<String> workout = new ArrayList<String>();

        if (workoutTypes.equals("Chest")){
            workout.add("Chest Press");
            workout.add("Chest Quantam");
        }else if (workoutTypes.equals("Bisecps")){
            workout.add("Bisecps Ext.");
            workout.add("Bisecps Time");
        }else if (workoutTypes.equals("Triceps")){
            workout.add("Triceps Ext.");
        }else if (workoutTypes.equals("Shoulders")){
            workout.add("Shoulder Press");
        }else {
            workout.add("Yet To Come");
        }
        return workout;
    }
}
