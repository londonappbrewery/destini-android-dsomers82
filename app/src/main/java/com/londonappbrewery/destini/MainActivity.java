package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryView;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(mStoryIndex == 1) {
                mStoryIndex = 3;
                updateStory(mStoryIndex);
            }else if(mStoryIndex == 2) {
                mStoryIndex = 3;
                updateStory(mStoryIndex);
            }else if (mStoryIndex == 3) {
                mStoryIndex = 6;
                updateStory(mStoryIndex);
            }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(mStoryIndex == 1) {
                  mStoryIndex = 2;
                  updateStory(mStoryIndex);
              }else if(mStoryIndex == 2) {
                  mStoryIndex = 4;
                  updateStory(mStoryIndex);
              }else if (mStoryIndex == 3) {
                  mStoryIndex = 5;
                  updateStory(mStoryIndex);
              }
            }
        });

    }

    public void updateStory(int storyProgression) {
        if(storyProgression == 2) {
            mStoryView.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
        }else if(storyProgression == 3) {
            mStoryView.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        }else if(storyProgression == 4) {
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
            mStoryView.setText(R.string.T4_End);
        }else if(storyProgression == 5) {
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
            mStoryView.setText(R.string.T5_End);
        }else if (storyProgression == 6) {
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
            mStoryView.setText(R.string.T6_End);
        }
    }
}
