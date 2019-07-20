package com.mattdog.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mattdog.swoosh.Model.Player
import com.mattdog.swoosh.R
import com.mattdog.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            //PASSING DATA:
            //'putExtra' allows you to pass on extra data aside from the context to the target class or app
            //skillActivity.putExtra(key, value)
            //They key must be listed in a 'Constants' file to make it a string constant
            //The type of 'putExtra' must be the same as the data type being passed. Select the 'Parcelable' type in autocomplete if passing classes.
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.", Toast.LENGTH_SHORT).show()
            //Toast is used for display messages over the screen. Disappears after a period of time.
        }
    }
    //Add the title of this function to the 'OnClick' attribute of the button to link it to the button being clicked

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }
}
