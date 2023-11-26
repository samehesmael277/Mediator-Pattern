class ConcreteColleague(private val mediator: Mediator, private val name:String): Colleague {

    override fun receiveMessage(message: String) {
        println("$name received message: $message")
    }

    override fun sendMessage(message: String) {
        println("$name send message: $message")
        mediator.sendMessage(message, this)
    }
}