package com.example.graphqlbugrepro

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

class Person {
    val friend: Person = Person()
}

@Component
class Queries : Query {
    fun getPerson(): Person = TODO()

    // Comment this line and it works
    fun addPerson(inputPerson: Person): String = TODO()
}