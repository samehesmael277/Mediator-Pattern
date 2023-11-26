fun main(args: Array<String>) {
    val mediator = ConcreteMediator()

    val colleague1 = ConcreteColleague(mediator, "Colleague 1")
    val colleague2 = ConcreteColleague(mediator, "Colleague 2")

    mediator.addColleague(colleague1)
    mediator.addColleague(colleague2)

    colleague1.sendMessage("Hello from Colleague 1!")
    colleague2.sendMessage("Hi there, Colleague 2!")
}