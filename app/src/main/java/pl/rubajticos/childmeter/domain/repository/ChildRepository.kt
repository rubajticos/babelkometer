package pl.rubajticos.childmeter.domain.repository

import pl.rubajticos.childmeter.domain.model.Child

interface ChildRepository {

    suspend fun addChild(child: Child)

    suspend fun getChild(id: String): Child?

    suspend fun getChildren(): List<Child>
}