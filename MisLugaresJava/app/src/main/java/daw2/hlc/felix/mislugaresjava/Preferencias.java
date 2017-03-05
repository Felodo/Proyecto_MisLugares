package daw2.hlc.felix.mislugaresjava;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Felix Lozano on 27/01/2017.
 */

public class Preferencias extends PreferenceActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
