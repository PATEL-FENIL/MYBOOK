package com.fenilcode.mybook;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class APTITUDE extends AppCompatActivity implements View.OnClickListener {

    private TextView questionTextView;
    private RadioGroup optionsRadioGroup;
    private Button nextButton;

    private String[] questions;
    private String[][] options;
    private int[] answers;

    private int currentQuestionIndex = 0;
    private int score = 0;
    private  static  String TAG = "Mybook";
    private TextView userAnswerTextView;
    private TextView correctAnswerTextView;


    private final String collectionPath = "questions"; // Replace with your actual collection path

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);

        questionTextView = findViewById(R.id.question_text_view);
        optionsRadioGroup = findViewById(R.id.options_radio_group);
        nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(this);
        userAnswerTextView = findViewById(R.id.user_answer_text_view);
        correctAnswerTextView = findViewById(R.id.correct_answer_text_view);

        // Initialize questions, options, and answers
        initializeQuizData();
    }

    private void initializeQuizData() {
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        CollectionReference questionsCollection = firestore.collection(collectionPath);

        questionsCollection.get()
                .addOnSuccessListener(querySnapshot -> {
                    List<String> questionsList = new ArrayList<>();
                    List<String[]> optionsList = new ArrayList<>();
                    List<Integer> answersList = new ArrayList<>();

                    for (QueryDocumentSnapshot document : querySnapshot) {
                        String question = document.getString("question");
                        List<String> optionsFromFirestore = (List<String>) document.get("options");
                        String[] optionsArray = optionsFromFirestore.toArray(new String[0]);
                        int answer = document.getLong("answer").intValue();

                        questionsList.add(question);
                        optionsList.add(optionsArray);
                        answersList.add(answer);
                    }

                    questions = questionsList.toArray(new String[0]);
                    options = optionsList.toArray(new String[0][]);
                    answers = answersList.stream().mapToInt(Integer::intValue).toArray();

                    // Display the first question
                    displayQuestion(currentQuestionIndex);
                })
                .addOnFailureListener(e -> {
                    // Handle the error
                });
    }

    private void displayQuestion(int questionIndex) {
        questionTextView.setText(questions[questionIndex]);
        optionsRadioGroup.clearCheck(); // Clear the previously checked RadioButton
        optionsRadioGroup.removeAllViews(); // Remove all previously added RadioButton instances

        for (int i = 0; i < options[questionIndex].length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(options[questionIndex][i]);
            optionsRadioGroup.addView(radioButton);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_button) {
            int selectedOptionIndex = optionsRadioGroup.getCheckedRadioButtonId();
            if (selectedOptionIndex != -1) {
                RadioButton selectedOption = findViewById(selectedOptionIndex);
                int userAnswer = optionsRadioGroup.indexOfChild(selectedOption);
                if (userAnswer == answers[currentQuestionIndex]) {
                    // User's answer is correct
                    userAnswerTextView.setText("Your answer is: " + selectedOption.getText());
                    correctAnswerTextView.setText("Correct answer is: " + selectedOption.getText());
                } else {
                    // User's answer is incorrect
                    int correctAnswer = answers[currentQuestionIndex];
                    userAnswerTextView.setText("Your answer is: " + selectedOption.getText());
                    correctAnswerTextView.setText("Correct answer is: " + options[currentQuestionIndex][correctAnswer]);
                }

                if (userAnswer == answers[currentQuestionIndex]) {
                    // User's answer is correct
                    showMessage("Your answer is correct");
                    score++;
                } else {
                    // User's answer is incorrect
                    int correctAnswer = answers[currentQuestionIndex];
                    showMessage("Correct answer is: " + options[currentQuestionIndex][correctAnswer]);
                }

                currentQuestionIndex++;
                if (currentQuestionIndex < questions.length) {
                    displayQuestion(currentQuestionIndex);
                } else {
                    // Quiz completed, display the final score
                    displayFinalScore();
                }
            }
        }
    }

    private void showMessage(String message) {
        // You can use a dialog, toast, or any other way to display the message
        // For example, using a Toast:
        android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT).show();
    }

    private void displayFinalScore() {
        if (questions == null || questions.length == 0) {
            // No questions were loaded from Firebase Firestore
            // Handle this case accordingly (e.g., show an error message)
            Log.d(TAG, "No questions loaded from Firestore");
        } else {
            int finalScore = calculateFinalScore(); // Calculate the final score

            // Create a dialog to display the final score and option to exit
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Quiz Completed");
            builder.setMessage("Your final score: " + finalScore);

            // Set image based on score
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)); // Set size here
            if (finalScore >= 8) {
                imageView.setImageResource(R.drawable.high_score_image);
            } else if (finalScore >= 5) {
                imageView.setImageResource(R.drawable.medium_score_image);
            } else {
                imageView.setImageResource(R.drawable.low_score_image);
            }
            builder.setView(imageView);

            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    // Exit the quiz
                    finish();
                }
            });
            builder.setCancelable(false); // Prevent the dialog from being dismissed when clicking outside
            builder.show();
        }
    }
    private int calculateFinalScore() {
        if (questions.length == 0) {
            // No questions were loaded from Firebase Firestore
            // Handle this case accordingly (e.g., show an error message)
            showMessage("Error: No questions were loaded from Firestore");
        } else {
            // Display the final score
            String finalScore = "Your final score is: " + score + "/" + questions.length;
            showMessage(finalScore);
        }
        return score;
    }
}