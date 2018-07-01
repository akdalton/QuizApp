package akdalton.com.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private int finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    public void submitButton(View view) {

        // Checked RadioButton for Question no. 1
        RadioButton question1 = this.findViewById(R.id.q1_opt_a);
        boolean q1_ans = question1.isChecked();
        int q1_score;
        if (q1_ans) {
            q1_score = 1;

        } else {
            q1_score = 0;

        }

        // Checked RadioButton for Question no. 2
        RadioButton question2 = this.findViewById(R.id.q2_opt_c);
        boolean q2_ans = question2.isChecked();
        int q2_score;
        if (q2_ans) {
            q2_score = 1;
        } else {
            q2_score = 0;
        }

        // Checked RadioButton for Question no. 3
        RadioButton question3 = this.findViewById(R.id.q3_opt_a);
        boolean q3_ans = question3.isChecked();
        int q3_score;
        if (q3_ans) {
            q3_score = 1;
        } else {
            q3_score = 0;
        }

        // Checked RadioButton for Question no. 4
        RadioButton question4 = this.findViewById(R.id.q4_opt_a);
        boolean q4_ans = question4.isChecked();
        int q4_score;
        if (q4_ans) {
            q4_score = 1;
        } else {
            q4_score = 0;
        }


        // Checked CheckBox for Question no. 5
        CheckBox question5_opt1 = this.findViewById(R.id.q5_opt_a);
        CheckBox question5_opt2 = this.findViewById(R.id.q5_opt_b);
        CheckBox question5_opt3 = this.findViewById(R.id.q5_opt_c);
        CheckBox question5_opt4 = this.findViewById(R.id.q5_opt_d);
        boolean q5_ans_a = question5_opt1.isChecked();
        boolean q5_ans_b = question5_opt2.isChecked();
        boolean q5_ans_c = question5_opt3.isChecked();
        boolean q5_ans_d = question5_opt4.isChecked();
        int q5_score;
        if (q5_ans_a && q5_ans_b && q5_ans_c && q5_ans_d) {
            q5_score = 1;
        } else {
            q5_score = 0;
        }


        // Checked RadioButton for Question no. 6
        RadioButton question6 = this.findViewById(R.id.q6_opt_a);
        boolean q6_ans = question6.isChecked();
        int q6_score;
        if (q6_ans) {
            q6_score = 1;
        } else {
            q6_score = 0;
        }

        // Checked CheckBox for Question no. 7
        CheckBox question7_opt1 = this.findViewById(R.id.q7_opt_a);
        CheckBox question7_opt2 = this.findViewById(R.id.q7_opt_b);
        CheckBox question7_opt3 = this.findViewById(R.id.q7_opt_c);
        boolean q7_ans_a = question7_opt1.isChecked();
        boolean q7_ans_b = question7_opt2.isChecked();
        boolean q7_ans_c = question7_opt3.isChecked();
        int q7_score;
        if (q7_ans_a && q7_ans_b && !q7_ans_c) {
            q7_score = 1;
        } else {
            q7_score = 0;
        }


        // Checked EditText for Question no. 8
        EditText question8 = this.findViewById(R.id.q8_ans);
        String q8_ans = question8.getText().toString();
        int q8_score;
        if (q8_ans.equals("XML resource parser")) {
            q8_score = 1;
        } else {
            q8_score = 0;
        }

        // Checked RadioButton for Question no. 9
        RadioButton question9 = this.findViewById(R.id.q9_opt_a);
        boolean q9_ans = question9.isChecked();
        int q9_score;
        if (q9_ans) {
            q9_score = 1;
        } else {
            q9_score = 0;
        }

        // Checked RadioButton for Question no. 10
        RadioButton question10 = this.findViewById(R.id.q10_opt_c);
        boolean q10_ans = question10.isChecked();
        int q10_score;
        if (q10_ans) {
            q10_score = 1;
        } else {
            q10_score = 0;
        }

        // Final Score
        finalScore = q1_score + q2_score + q3_score + q4_score + q5_score + q6_score + q7_score + q8_score + q9_score + q10_score;

        Button button = findViewById(R.id.submit_button);


        // Conditions for Submit Button
        if (finalScore == 8 || finalScore == 9 || finalScore == 10 ) {

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    CharSequence display;
                    //Displaying the message in toast
                    display = "Congratulation ! You Scored " + finalScore + "/10";
                    Toast toast = Toast.makeText(getApplicationContext(), display, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    CharSequence display;
                    //Displaying the message in toast
                    display = "Sorry ! You Scored " + finalScore +"/10" +"\n Please try again";
                    Toast toast = Toast.makeText(getApplicationContext(), display, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            });
        }


    }

} // The End
