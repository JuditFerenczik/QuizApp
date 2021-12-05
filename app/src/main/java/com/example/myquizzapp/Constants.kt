package com.example.myquizzapp

object Constants {


    const val USER_NAME :String = "user name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS : String ="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
1,"What country does this flag belong to?",
        R.drawable.ic_flag_of_argentina,
        "Argentina","Aurtralia",
        "Armenia", "Austria",1
            )
        questionsList.add(que1)

        val que2 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Denmark","Aurtralia",
            "Brazil", "Austria",2
        )
        questionsList.add(que2)
        val que3 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium","Aurtralia",
            "Denmark", "Austria",1
        )
        questionsList.add(que3)
        val que4 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Aurtralia",
            "Armenia", "Brazil",4
        )
        questionsList.add(que4)
        val que5 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina","Brazil",
            "Denmark", "Germany",3
        )
        questionsList.add(que5)
        val que6 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Denmark",
            "Germany", "Austria",1
        )
        questionsList.add(que6)
        val que7 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina","Denmark",
            "Germany", "Kuwait",3
        )
        questionsList.add(que7)
        val que8 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina","Denmark",
            "Germany", "New Zealand",4
        )
        questionsList.add(que8)
        val que9 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Germany","Fiji",
            "India", "Kuwait",3
        )
        questionsList.add(que9)
        return  questionsList
    }

}