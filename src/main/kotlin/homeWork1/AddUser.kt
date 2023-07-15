package homeWork1

import java.io.File
import java.util.Scanner

class AddUser : WorkUser{
    val scanner=Scanner(System.`in`)
    val file =File("Users.txt")
    val arrayList= ArrayList<String>()

    override fun addUser() {
        file.createNewFile()
        print("Name: ")
        val name= scanner.next()
        print("Password: ")
        val password =scanner.next()
        file.writeText(User(name,password).toString())
        arrayList.add(file.readText())
    }

    override fun readUser() {
        file.createNewFile()
        file.delete()
        for (i in arrayList){
            file.appendText(i)
        }
        if (file.length()>0){
            for (i in file.readLines()){
                println(i)
            }
        }else{
            println("Bo'sh")
        }
    }

    override fun deleteUser(){
        file.createNewFile()
        print("Name: ")
        val name= scanner.next()
        print("Password: ")
        val password =scanner.next()
        for (i in arrayList.indices){
            if (arrayList[i].contains(name) && arrayList[i].contains(password)){
                arrayList.removeAt(i)
            }
        }
    }

    override fun renameUser() {
        file.createNewFile()
        print("Name: ")
        val name= scanner.next()
        print("Password: ")
        val password =scanner.next()
        print("Rename: ")
        val rename=scanner.next()
        print("Repassword: ")
        val repassword=scanner.next()
        for (i in arrayList){
            if (i.contains(name) && i.contains(password)){
                arrayList.remove(i)
                arrayList.add(User(rename,repassword).toString())
            }
        }
    }

    override fun searchUser() {
        file.createNewFile()
         print("Name: ")
        val name= scanner.next()
        print("Password: ")
        val password =scanner.next()
        for (i in arrayList){
            if (i.contains(name) && i.contains(password)){
                println(i)
            }
        }
    }

}