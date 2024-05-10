package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "What is the recommended duration for cardiovascular exercise per week, according to fitness guidelines?",
            arrayListOf("30 minutes", "60 minutes", "90 minutes", "120 minutes"),
            1,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Which of the following exercises primarily targets the abdominal muscles?",

            arrayListOf("Squats", "Push-ups", "Crunches", "Lunges"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "How many days a week is it recommended to engage in strength training exercises?",

            arrayListOf("1-2 days", "3-4 days", "5-6 days", "Every day"),
            1
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What does BMI stand for in relation to fitness and health?",

            arrayListOf("Body Mass Index", "Body Measurement Index", "Body Muscle Index", "Body Metabolic Index"),
            0
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Which of the following is a high-intensity interval training (HIIT) exercise?",

            arrayListOf("Walking", "Cycling", "Sprinting", "Yoga"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "What is the recommended amount of water intake per day for adults?",

            arrayListOf("1 liter", "2 liters", "3 liters", "4 liters"),
            1
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Which of the following nutrients is the body's main source of energy?",

            arrayListOf("Protein", "Fat", "Carbohydrates", "Vitamins"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What is the ideal resting heart rate for adults?",

            arrayListOf("40-50 beats per minute", "60-100 beats per minute", "100-120 beats per minute", "120-140 beats per minute"),
            1
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Which type of stretching is best performed after a workout to improve flexibility?",

            arrayListOf("Static stretching", "Dynamic stretching", "PNF stretching", "Ballistic stretching"),
            0
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "What is the correct form for a proper squat?",

            arrayListOf("Keep knees behind toes", "Arch the back", "Lean forward", "Lift heels off the ground"),
            0
        )
        questionsList.add(questionTen)

        // 11
        val questionEleven = Question(
            11,
            "Which of the following is NOT a component of physical fitness?",

            arrayListOf("Strength", "Endurance", "Agility", "Relaxation"),
            3
        )
        questionsList.add(questionEleven)

        // 12
        val questionTwelve = Question(
            12,
            "What is the recommended amount of sleep for adults per night?",

            arrayListOf("4-5 hours", "6-7 hours", "8-9 hours", "10-11 hours"),
            2
        )
        questionsList.add(questionTwelve)

        // 13
        val questionThirteen = Question(
            13,
            "What is the purpose of a warm-up before exercising?",

            arrayListOf("Prevent injury", "Increase heart rate abruptly", "Improve flexibility", "Cool down the body"),
            0
        )
        questionsList.add(questionThirteen)

        // 14
        val questionFourteen = Question(
            14,
            "Which of the following activities provides both cardiovascular and strength training benefits?",

            arrayListOf("Swimming", "Yoga", "Pilates", "Tai Chi"),
            0
        )
        questionsList.add(questionFourteen)

        // 15
        val questionFifteen = Question(
            15,
            "What is the term for the maximum amount of weight a person can lift for a specific exercise?",

            arrayListOf("1RM (One Repetition Maximum)", "ORM (Overall Repetition Maximum)", "ERM (Exercise Repetition Maximum)", "MRM (Maximum Repetition Maximum)"),
            0
        )
        questionsList.add(questionFifteen)

        return questionsList
    }
}