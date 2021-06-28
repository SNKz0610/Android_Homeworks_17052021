package com.snkz.fragmentlifecycle

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Information(val name: String, val age: Int, val address: String) : Parcelable
