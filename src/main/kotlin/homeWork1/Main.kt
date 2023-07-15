package homeWork1

import java.util.*

fun main() {
    val addedUser= AddUser()
    val scanner=Scanner(System.`in`)

    while (true){
        print("1.Add user 2.Read user 3.Delete user  4.Rename user  5.Search user  6.Exit\n")
        when(scanner.nextInt()){
            1->addedUser.addUser()
            2->addedUser.readUser()
            3->addedUser.deleteUser()
            4->addedUser.renameUser()
            5->addedUser.searchUser()
            6->break
        }
    }
}

