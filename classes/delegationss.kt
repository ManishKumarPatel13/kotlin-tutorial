// delegations is like representative


fun main() {
    val taskname = "Download file"
    val taskManager = TaskManager(bgTask(taskname), bgExecute(taskname))
    taskManager.create()
    taskManager.Execute()
}

interface Task{
    fun create()
}

interface ExecuteTask{
    fun Execute()
}

class bgTask (val task :String):Task{
    override fun create(){println("Task created $task")} // here we took task as a string
}

class bgExecute(val task: String): ExecuteTask{
    override fun Execute(){println("Task executed $task")}
}

class TaskManager(val creator: Task,val executor: ExecuteTask): Task by creator, ExecuteTask by executor{ // and by is used for delegation
    // override fun create(){
    //     creator.create()
    // }

    // override fun Execute(){
    //     executor.Execute()
    // } // removed these because we are taking the same class as parameter which implements the same class we have implemented here
}