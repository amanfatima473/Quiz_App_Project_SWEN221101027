package quiz.app.questions.professional.exams.models

data class Question (var currentQuestion: String, var optionA: String,var optionB: String,var optionC: String,var optionD: String, var answer: String)

object Supplier {
    val questions = listOf<Question>(
        Question("What is the capital of Pakistan?", "Islamabad", "Rahim Yar Khan", "Lahore", "Karachi", "a"),
        Question(" What is the highest mountain in Pakistan?", "Nanga Parbat", "Rakaposhi", "Everest", "K2", "d"),
        Question("Which city is known as the \"City of Lights\" in Pakistan?", " Islamabad ", "Lahore", " Karachi", "Rahim Yar Khan", "c"),
        Question("Which is the largest country in the world by land area?", "Canada", "Russia", "India", "China", "b"),
        Question("When did Pakistan become an independent country?", "14th August 1947", "23rd March 1940", "26th January 1950", "15th August 1947", "a")

    )


}