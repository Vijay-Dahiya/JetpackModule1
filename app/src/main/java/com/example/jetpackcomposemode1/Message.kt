package com.example.jetpackcomposemode1

data class Message(val author: String, val body: String)

open class SampleData {

    companion object {

        val convertationList: List<Message> = listOf(
            Message("Android","In short, this lambda is called for each item of the provided List"),
            Message("Android","It takes a List as a parameter and its lambda receives a parameter we’ve named message (we could have named it whatever we want) which is an instance of Message"),
            Message("Android","In this code snippet, you can see that LazyColumn has an items child."),
            Message("Android","These composables render only the elements that are visible on screen, so they are designed to be very efficient for long lists."),
            Message("Hello","You'll need to create a Conversation function that will show multiple messages"),
            Message("Project","Jetpack Compose is hera"),
            Message("Alim","Compose these lines of code hello gpt and hello jetpack compose"),
            Message("Android","A chat with one message feels a bit lonely, so we are going to change the conversation to have more than one message"),
            Message("Android","In short, this lambda is called for each item of the provided List"),
            Message("Android","It takes a List as a parameter and its lambda receives a parameter we’ve named message (we could have named it whatever we want) which is an instance of Message"),
            Message("Android","In this code snippet, you can see that LazyColumn has an items child."),
            Message("Android","These composables render only the elements that are visible on screen, so they are designed to be very efficient for long lists."),
            Message("Hello","You'll need to create a Conversation function that will show multiple messages"),
            Message("Project","Jetpack Compose is hera"),
            Message("Alim","Compose these lines of code hello gpt and hello jetpack compose"),
            Message("Android","A chat with one message feels a bit lonely, so we are going to change the conversation to have more than one message")
        )



    }
}