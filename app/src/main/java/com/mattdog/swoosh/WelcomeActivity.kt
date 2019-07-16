package com.mattdog.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

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
}
