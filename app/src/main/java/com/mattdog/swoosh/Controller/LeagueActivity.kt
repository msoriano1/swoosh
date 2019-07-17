package com.mattdog.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mattdog.swoosh.Utilities.EXTRA_LEAGUE
import com.mattdog.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            //PASSING DATA:
            //'putExtra' allows you to pass on extra data aside from the context to the target class or app
            //skillActivity.putExtra(key, value)
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

        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }
}
