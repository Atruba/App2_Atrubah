package com.example.thequiz;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Guide extends AppCompatActivity {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(Guide.this,PlayActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
        fragmentManager = getSupportFragmentManager();

        // new instance is created and data is took from an
        // array list known as getDataonborading
        final PaperOnboardingFragment paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataforOnboarding());
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // fragmentTransaction method is used
        // do all the transactions or changes
        // between different fragments
        fragmentTransaction.add(R.id.frame_layout, paperOnboardingFragment);

        // all the changes are committed
        fragmentTransaction.commit();
    }

    private ArrayList<PaperOnboardingPage> getDataforOnboarding() {

        // the first string is to show the main title ,
        // second is to show the message below the
        // title, then color of background is passed ,
        // then the image to show on the screen is passed
        // and at last icon to navigate from one screen to other
        PaperOnboardingPage source = new PaperOnboardingPage("Gfg", "Welcome to GeeksForGeeks", Color.parseColor("F8DA60"),R.drawable.learn, R.drawable.search);
        PaperOnboardingPage source1 = new PaperOnboardingPage("Practice", "Practice questions from all topics", Color.parseColor("F8DA60"),R.drawable.practice, R.drawable.training);
        PaperOnboardingPage source2 = new PaperOnboardingPage("", " ", Color.parseColor("F8DA60"),R.drawable.spread, R.drawable.people);

        // array list is used to store
        // data of onbaording screen
        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();

        // all the sources(data to show on screens)
        // are added to array list
        elements.add(source);
        elements.add(source1);
        elements.add(source2);
        return elements;
    }
}
