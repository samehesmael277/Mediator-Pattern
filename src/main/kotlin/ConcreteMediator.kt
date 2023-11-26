class ConcreteMediator: Mediator {
    private val colleagues: MutableList<Colleague> = mutableListOf()

    fun addColleague(colleague: Colleague) {
        colleagues.add(colleague)
    }

    override fun sendMessage(message: String, colleague: Colleague) {
        for (c in colleagues) {
            c.receiveMessage(message)
        }
    }
}