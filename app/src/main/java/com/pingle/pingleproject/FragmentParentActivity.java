package com.pingle.pingleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.pingle.pingleproject.fragmentsParent.AboutFragment;
import com.pingle.pingleproject.fragmentsParent.AddressFragment;
import com.pingle.pingleproject.fragmentsParent.CallingFragment;
import com.pingle.pingleproject.fragmentsParent.CardDetailFragment;
import com.pingle.pingleproject.fragmentsParent.NotificationFragment;
import com.pingle.pingleproject.fragmentsParent.PaytmFragment;
import com.pingle.pingleproject.fragmentsParent.ReferFragment;
import com.pingle.pingleproject.fragmentsParent.SupportFragment;
import com.pingle.pingleproject.fragmentsParent.VerificationFragment;

public class FragmentParentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_parent);

        int fragmentID = getIntent().getIntExtra("id", 1);

        switch (fragmentID) {



            case FragmentsConstants.PAYTM:
                replaceFragment(new PaytmFragment());
                break;
            case FragmentsConstants.SUPPORT:
                replaceFragment(new SupportFragment());
                break;

            case FragmentsConstants.SAVED_CARD:
                replaceFragment(new CardDetailFragment());
                break;

            case FragmentsConstants.SAVED_ADDRESS:
                replaceFragment(new AddressFragment());
                break;
            case FragmentsConstants.REFER_PARTNER:
                replaceFragment(new ReferFragment());
                break;

            case FragmentsConstants.PINGAL_CALLING:
                replaceFragment(new CallingFragment());
                break;


            case FragmentsConstants.NOTIFICATION_SETTING:

                replaceFragment(new NotificationFragment());
                break;

            case FragmentsConstants.ABOUT:
                replaceFragment(new AboutFragment());
                break;


        }

    }

    private void replaceFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}