package com.then0wheregirl.santanderproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.then0wheregirl.santanderproject.adapter.SantanderAdapter;
import com.then0wheregirl.santanderproject.adapter.SantanderViewHolder;
import com.then0wheregirl.santanderproject.fragments.ContactFragment;
import com.then0wheregirl.santanderproject.fragments.InvestimentFragment;
import com.then0wheregirl.santanderproject.model.fund.Fund;
import com.then0wheregirl.santanderproject.model.fund.Info;
import com.then0wheregirl.santanderproject.santanderAPI.APIBase;
import com.then0wheregirl.santanderproject.santanderAPI.EndPoint;
import com.then0wheregirl.santanderproject.utils.PageAnimation;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button barContact;
    private Button barInvest;

    private FragmentManager fragMngr;

    private InvestimentFragment investFrag;
    private ContactFragment contactFrag;

    RecyclerView infoRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       barContact = findViewById(R.id.bar_Contact);
       barInvest = findViewById(R.id.bar_Invest);

       fragMngr = getSupportFragmentManager();

       investFrag = new InvestimentFragment();
       contactFrag = new ContactFragment();


       infoRecyclerView = findViewById(R.id.rc_info);

       switchFrag(investFrag,null);  //reference it

        barInvest.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                switchFrag(investFrag, PageAnimation.SLIDE_LEFT_TO_RIGHT);

            }
        });
        barContact.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                switchFrag(contactFrag, PageAnimation.SLIDE_RIGHT_TO_LEFT);
            }
        });
    }

    private void switchFrag(Fragment fragment, PageAnimation pageAnimation) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (pageAnimation != null) {
            int enter = pageAnimation.getInTransition();
            int exit = pageAnimation.getOutTransition();
            if (enter > 0 && exit > 0) {
                fragmentTransaction.setCustomAnimations(enter, exit);
            }
        }

        fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
    }
    }

