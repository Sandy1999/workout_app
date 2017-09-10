package com.example.sanidhya.findsworkout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends Activity {
    private  WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);
    }
    public void onClickFindWorkout(View view){
        TextView workout = (TextView) findViewById(R.id.textView);

        Spinner workouttype = (Spinner) findViewById(R.id.workouttype);

        String workoutname = String.valueOf(workouttype.getSelectedItem());

        List<String> workouts = expert.getWorkouts(workoutname);

        StringBuilder formattedWorkout = new StringBuilder();

        for (String works: workouts){
            formattedWorkout.append(works).append('\n');
        }

        workout.setText(formattedWorkout);
    }
}
