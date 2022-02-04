package daos

import util.FileAble

interface DAO<T: FileAble> {


    fun initTable()
    fun create(obj: T)
    fun listAll(): List<T>
    fun get(id: Long): T

}