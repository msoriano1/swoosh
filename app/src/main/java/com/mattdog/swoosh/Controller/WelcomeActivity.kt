package com.mattdog.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.mattdog.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        //To setup new Activity, right click the main folder under 'java', select 'New', select 'Activity', select 'Empty Activity'

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            // Intent(context, target class or app)
            startActivity(leagueIntent)
            //Intent is an object that lets you interact with other objects, as well as your own
            //Implicit Intent: specify action type without specifying the target class or app that handles the action and send to android system. android system searches compatible apps/classes that match the action type and present options to the user.
            //Explicit Intent: specify action type and specify the target class or app that handles the action.

            //Context: information on the activity that will be executed
            //Activity Lifecycle Context: Context for a singular activity
            //Application Context: Context for the entire application

        }

    }
    // OnCreate(): basic startup logic, setting variables and onclick listeners. Called only once during its lifetime.
    // OnStart(): makes the view visible to the user
    // OnResume(): app is active and running. Keeps running until something takes focus away from the activity.
    // OnPause(): First state from moving away from the activity. Pauses animation, music, etc. View becomes semitransparent.
    // OnStop(): When a new activity completely covers the curent activity (e.g. Home button, Take an incoming call, new Activity, etc)
    // OnRestart(): User navigates back to the current activity
    // OnDestroy(): Final call that activity receives.
}
