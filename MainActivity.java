package com.judas.fightingwritersblock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText StoreIdeaET;
    Button GenerateActivityButton;
    Button ViewIdeasButton;
    Button SaveIdeaButton;
    TextView ActivityView;
    ListView savedIdeas;
    ArrayList<String> mIdeas;
    ArrayList<String> idLV;

    private String [] TaskSyn = { //array of activities
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Good'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Bad'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Happy'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Sad'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Difficult'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Easy'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'Upset'"),
            ("Write " + new Random().nextInt(20) + "synonyms of the word 'UnTidy'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Good'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Bad'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Happy'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Sad'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Difficult'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Easy'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'Upset'"),
            ("Write " + new Random().nextInt(20) + "antonyms of the word 'UnTidy'"),
            ("Write " + new Random().nextInt(20) + "sentences about the zombie apocalypse"),
            ("Write " + new Random().nextInt(20) + "sentences about the a young lover with a terminal illness"),
            ("Write " + new Random().nextInt(20) + "sentences about the rain"),
            ("Write " + new Random().nextInt(20) + "sentences about a flower in bloom"),
            ("Write " + new Random().nextInt(20) + "sentences about the revolutionary war"),
            ("Write " + new Random().nextInt(20) + "sentences about a vampire who's lost his fang"),
            ("Write " + new Random().nextInt(20) + "sentences about an abandoned asylum"),
            ("Write " + new Random().nextInt(20) + "sentences about the Great Depression"),
            ("Write " + new Random().nextInt(20) + "sentences about a blind man and his dog"),
            ("Write " + new Random().nextInt(20) + "sentences about a tsunami fighting a samurai"),
            ("Write " + new Random().nextInt(20) + "sentences about the Greek parthenon"),
            ("Write " + new Random().nextInt(20) + "sentences about the decision to go to college"),
            ("Write " + new Random().nextInt(20) + "sentences about a girl who spent her rent money on drugs"),
            ("Write " + new Random().nextInt(20) + "sentences about a family of 5 having dinner"),
            ("Write " + new Random().nextInt(20) + "sentences about what it would be like to be trapped in a video game"),
            ("Write " + new Random().nextInt(20) + "sentences about staying up all night"),


    };
    private int mCurrentIndex = 0;

    public class Question {
        private int mTextResId;

        public Question(int textResId) {
            mTextResId = textResId;
        }

        public int getTextResId() {
            return mTextResId;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewIdeasButton = (Button) findViewById(R.id.view_save_button);
        GenerateActivityButton = (Button) findViewById(R.id.activity_button);
        StoreIdeaET = (EditText) findViewById(R.id.idea_store_et);
        SaveIdeaButton = (Button) findViewById(R.id.save_idea_button);
        ActivityView = (TextView) findViewById(R.id.activity_prompt_tv);
        savedIdeas = (ListView) findViewById(R.id.ideas_lv);


        ViewIdeasButton.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View v){
                   Intent myIntent = new Intent(MainActivity.this,IdeasList.class);
                   startActivity(myIntent);
               }

           });

        SaveIdeaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String newIdea = StoreIdeaET.toString();

                idLV.add(newIdea);

            }});

        GenerateActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex = new Random().nextInt(32);
                ActivityView.setText(mCurrentIndex);

            }});

        String newIdea = StoreIdeaET.getText().toString();
        //Make sure user has entered some text
        if (newIdea.length() > 0) {
            mIdeas.add(newIdea);
            StoreIdeaET.getText().clear(); //Clear contents of EditText, ready for new Idea
            MainActivity.this.updateIdeasList();
        }
        else {
            Toast.makeText(MainActivity.this,
                    "Please type your ideas", Toast.LENGTH_SHORT).show();
        }}

   private void updateIdeasList() {
        //Create a String from all of the names in the IdeasList list, separated by newlines
        for (String name : mIdeas) {

       }
    }
}
