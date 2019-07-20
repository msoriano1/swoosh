package com.mattdog.swoosh.Model

import android.os.Parcel
import android.os.Parcelable

class Player(var league: String?, var skill: String?) :Parcelable{
    //To allow this class to be passed from activity to activity, it must be declared as 'Parcelable'
    //To add the necessary methods for parcelable, right click ':Parcelable' and click 'Add Parcelable Implementation'
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }

}

